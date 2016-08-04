package experimental.patterns.builder;

import java.awt.Color;

/**
 * Builder used to make creation of a {@link MessageDialog} simple
 * Created by liamdg on 4/08/16.
 */
public class MessageDialogBuilder {
    //Defaults can be set initially in case they aren't set by builder
    private final String tag;
    private String header = "",
            body = "",
            primaryButtonText = "",
            secondaryButtonText = "";
    private Color bgColor = Color.BLACK;
    private boolean cancelable = false;

    public MessageDialogBuilder(final String tag) {
        this.tag = tag;
    }

    public MessageDialogBuilder setHeader(final String header) {
        this.header = header;
        return this;
    }

    public MessageDialogBuilder setBody(final String body) {
        this.body = body;
        return this;
    }

    public MessageDialogBuilder setPrimaryButtonText(final String primaryButtonText) {
        this.primaryButtonText = primaryButtonText;
        return this;
    }

    public MessageDialogBuilder setSecondaryButtonText(final String secondaryButtonText) {
        this.secondaryButtonText = secondaryButtonText;
        return this;
    }

    public MessageDialogBuilder setBgColor(final Color bgColor) {
        this.bgColor = bgColor;
        return this;
    }

    public MessageDialogBuilder setCancelable(final boolean cancelable) {
        this.cancelable = cancelable;
        return this;
    }

    public MessageDialog build() {
        return new MessageDialog(tag, header, body, primaryButtonText, secondaryButtonText, bgColor, cancelable);
    }
}
