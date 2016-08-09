package experimental.patterns.strategy;

/**
 * An object that takes two strings and merges them
 * given a specific Merging strategy
 * Created by liamdg on 9/08/16.
 */
public class MergedString {
    private final String str1, str2;
    private final Merger merger;

    public MergedString(final String str1, final String str2, final Merger merger) {
        this.str1 = str1;
        this.str2 = str2;
        this.merger = merger;
    }

    public String getMergedString() {
        return merger.merge(str1, str2);
    }
}
