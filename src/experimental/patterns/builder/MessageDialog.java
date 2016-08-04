package experimental.patterns.builder;

import java.awt.Color;

/**
 * A complex object that requires multiple parameters to be
 * passed in order for creation
 * Created by liamdg on 4/08/16.
 */
public class MessageDialog {
    private final String tag;
    private final String header, body, primaryButtonText, secondaryButtonText;
    private final Color bgColor;
    private final boolean cancelable;

    public MessageDialog(final String tag, final String header,
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
