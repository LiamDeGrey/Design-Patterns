package experimental.patterns.abstractbuilder.library;

import java.awt.Color;

/**
 * A complex object that requires multiple parameters to be
 * passed in order for creation
 * This is the abstract library variant
 * Created by liamdg on 4/08/16.
 */
public abstract class AbstractMessageDialog {
    protected final String tag;
    protected final String header, body, primaryButtonText, secondaryButtonText;
    protected final Color bgColor;
    protected final boolean cancelable;

    public AbstractMessageDialog(final String tag, final String header,
                                 final String body, final String primaryButtonText,
                                 final String secondaryButtonText, final Color bgColor,
                                 final boolean cancelable) {
        this.tag = tag;
        this.header = header;
        this.body = body;
        this.primaryButtonText = primaryButtonText;
        this.secondaryButtonText = secondaryButtonText;
        this.bgColor = bgColor;
        this.cancelable = cancelable;
    }

    public String getTag() {
        return tag;
    }

    public String getHeader() {
        return header;
    }

    public String getBody() {
        return body;
    }

    public String getPrimaryButtonText() {
        return primaryButtonText;
    }

    public String getSecondaryButtonText() {
        return secondaryButtonText;
    }

    public Color getBgColor() {
        return bgColor;
    }

    public boolean isCancelable() {
        return cancelable;
    }
}
