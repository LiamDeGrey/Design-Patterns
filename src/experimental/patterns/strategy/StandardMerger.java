package experimental.patterns.strategy;

/**
 * A merger that merges by simply adding one string to
 * the end of the other
 * Created by liamdg on 9/08/16.
 */
public class StandardMerger implements Merger {

    @Override
    public String merge(final String str1, final String str2) {
        return str1.concat(str2);
    }
}
