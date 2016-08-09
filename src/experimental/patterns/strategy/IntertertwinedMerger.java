package experimental.patterns.strategy;

/**
 * A merger that merges the strings by intertwining the
 * two components
 * Created by liamdg on 9/08/16.
 */
public class IntertertwinedMerger implements Merger {

    @Override
    public String merge(final String str1, final String str2) {
        String mergedString = "";
        for (int i = 0; i < Math.max(str1.length(), str2.length()); i++) {
            if (str1.length() > i) {
                mergedString = mergedString.concat(String.valueOf(str1.charAt(i)));
            }
            if (str2.length() > i) {
                mergedString = mergedString.concat(String.valueOf(str2.charAt(i)));
            }
        }

        return mergedString;
    }
}
