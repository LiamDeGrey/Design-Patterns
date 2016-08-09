package experimental.patterns.strategy;

/**
 * This class is the Strategy interface declaring what methods
 * need to be implemented by concrete classes
 * Created by liamdg on 9/08/16.
 */
public interface Merger {

    String merge(final String str1, final String str2);
}
