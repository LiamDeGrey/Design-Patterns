package experimental.patterns.strategy_java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;

import experimental.utils.Constants;

/**
 * Used to initiate the corresponding pattern program
 * Created by liamdg on 4/08/16.
 */
public class Main {
    private static final String PATTERN_NAME = "Strategy Java 8";

    private static final int NUMBER_ITEMS = 10000000;
    private static final int NUMBER_THREADS = 10;
    private static final int NUMBER_ITEMS_EACH = NUMBER_ITEMS / NUMBER_THREADS;

    public static void main(final String[] args) {
        System.out.printf(Locale.getDefault(), Constants.STARTUP_MSG, PATTERN_NAME);

        final List<Character> rawCharacters = new ArrayList<>();
        for (int i = 0; i < NUMBER_ITEMS; i++) {
            rawCharacters.add((char) (Math.random() * 26 + 65));
        }

        final Map<Character, Integer> uniqueLetters = new OptimizedHashMap();
        final List<Thread> findUniqueLettersThreads = new ArrayList<>();
        for (int i = 0; i < NUMBER_THREADS; i++) {
            final int index = i;
            findUniqueLettersThreads.add(new Thread(() -> {
                int startIndex = index * NUMBER_ITEMS_EACH;
                final List<Character> items = rawCharacters.subList(startIndex, startIndex + NUMBER_ITEMS_EACH);
                final Map<Character, Integer> workersUniqueLetters = new HashMap<>();
                items.forEach(
                        character ->
                                workersUniqueLetters.put(character, workersUniqueLetters.containsKey(character) ?
                                        workersUniqueLetters.get(character) + 1 :
                                        1
                                ));
                uniqueLetters.putAll(workersUniqueLetters);
            }));
            findUniqueLettersThreads.get(index).start();
        }

        joinThreads(findUniqueLettersThreads);

        final Map<Character, Integer> testMap = new OptimizedHashMap();
        rawCharacters.forEach(character -> testMap.put(character, 1));

        testMap.forEach((character, integer) ->
                System.out.println(String.format(Locale.getDefault(),
                        "Character = %c, threads calculated correctly? %b",
                        character, integer.equals(uniqueLetters.get(character))
                )));

    }

    private static void joinThreads(final List<Thread> threads) {
        threads.forEach(thread -> {
            try {
                thread.join();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    private static class OptimizedHashMap extends HashMap<Character, Integer> {

        @Override
        public Integer put(final Character key, final Integer value) {
            return super.put(key, containsKey(key) ? get(key) + value : value);
        }

        @Override
        public void putAll(final Map<? extends Character, ? extends Integer> m) {
            putAllSynchronized(m);
        }

        private synchronized void putAllSynchronized(final Map<? extends Character, ? extends Integer> m) {
            if (isEmpty()) {
                super.putAll(m);
                return;
            }

            m.forEach((BiConsumer<Character, Integer>) this::put);
        }
    }
}
