package experimental.patterns.abstractbuilder.implementation;

import java.awt.Color;

import experimental.patterns.abstractbuilder.library.AbstractMessageDialogBuilder;

/**
 * Builder used to make creation of a {@link MessageDialog} simple
 * Created by liamdg on 4/08/16.
 */
public class MessageDialogBuilder extends AbstractMessageDialogBuilder {
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

    @Override
    public MessageDialogBuilder setHeader(final String header) {
        this.header = header;
        return this;
    }

    @Override
    public MessageDialogBuilder setBody(final String body) {
        this.body = body;
        return this;
    }

    @Override
    public MessageDialogBuilder setPrimaryButtonText(final String primaryButtonText) {
        this.primaryButtonText = primaryButtonText;
        return this;
    }

    @Override
    public MessageDialogBuilder setSecondaryButtonText(final String secondaryButtonText) {
        this.secondaryButtonText = secondaryButtonText;
        return this;
    }

    @Override
    public MessageDialogBuilder setBgColor(final Color bgColor) {
        this.bgColor = bgColor;
        return this;
    }

    @Override
    public MessageDialogBuilder setCancelable(final boolean cancelable) {
        this.cancelable = cancelable;
        return this;
    }

    @Override
    public MessageDialog build() {
        return new MessageDialog(tag, header, body, primaryButtonText, secondaryButtonText, bgColor, cancelable);
    }
}
