package experimental.patterns.strategy;

import java.util.Locale;

import experimental.utils.Constants;

/**
 * Used to initiate the corresponding pattern program
 * Created by liamdg on 4/08/16.
 */
public class Main {
    private static final String PATTERN_NAME = "Strategy";

    public static void main(final String[] args) {
        System.out.printf(Locale.getDefault(), Constants.STARTUP_MSG, PATTERN_NAME);

        final String str1 = "Hello";
        final String str2 = "World!";
        final MergedString mergedStringStandard = new MergedString(str1, str2, new StandardMerger());
        final MergedString mergedStringIntertwined = new MergedString(str1, str2, new IntertertwinedMerger());

        final boolean correct = mergedStringStandard.getMergedString().equals("HelloWorld!") &&
                mergedStringIntertwined.getMergedString().equals("HWeolrllod!");

        System.out.println("Strategy pattern is correct ? " + correct);
    }
}
