package experimental.patterns.abstractbuilder.library;

import java.awt.Color;

/**
 * Abstract builder used to make creation of a
 * {@link experimental.patterns.abstractbuilder.implementation.MessageDialog}
 * simple
 * Created by liamdg on 4/08/16.
 */
public abstract class AbstractMessageDialogBuilder {

    public abstract AbstractMessageDialogBuilder setHeader(final String header);

    public abstract AbstractMessageDialogBuilder setBody(final String body);

    public abstract AbstractMessageDialogBuilder setPrimaryButtonText(final String primaryButtonText);

    public abstract AbstractMessageDialogBuilder setSecondaryButtonText(final String secondaryButtonText);

    public abstract AbstractMessageDialogBuilder setBgColor(final Color bgColor);

    public abstract AbstractMessageDialogBuilder setCancelable(final boolean cancelable);

    public abstract AbstractMessageDialog build();
}
