package experimental.patterns.abstractbuilder.implementation;

import java.awt.Color;

import experimental.patterns.abstractbuilder.library.AbstractMessageDialog;

/**
 * A complex object that requires multiple parameters to be
 * passed in order for creation
 * Created by liamdg on 4/08/16.
 */
public class MessageDialog extends AbstractMessageDialog {

    public MessageDialog(final String tag, final String header,
                         final String body, final String primaryButtonText,
                         final String secondaryButtonText, final Color bgColor,
                         final boolean cancelable) {
        super(tag, header, body, primaryButtonText, secondaryButtonText, bgColor, cancelable);
    }
}
