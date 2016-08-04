package experimental.patterns.builder;

import java.awt.Color;
import java.util.Locale;

import experimental.utils.Constants;

/**
 * Used to initiate the corresponding pattern program
 * Created by liamdg on 4/08/16.
 */
public class Main {
    private static final String PATTERN_NAME = "Builder";

    public static void main(final String[] args) {
        System.out.printf(Locale.getDefault(), Constants.STARTUP_MSG, PATTERN_NAME);

        final String tag = "tag";
        final String header = "header";
        final String body = "body";
        final String primaryButtonText = "primaryButtonText";
        final String secondaryButtontext = "secondaryButtonText";
        final Color bgColor = Color.BLUE;
        final boolean cancelable = true;

        final MessageDialog messageDialog = new MessageDialogBuilder(tag)
                .setHeader(header)
                .setBody(body)
                .setPrimaryButtonText(primaryButtonText)
                .setSecondaryButtonText(secondaryButtontext)
                .setBgColor(bgColor)
                .setCancelable(cancelable)
                .build();

        boolean messageDialogBuilderWorks = true;
        messageDialogBuilderWorks &= messageDialog.getTag().equals(tag);
        messageDialogBuilderWorks &= messageDialog.getHeader().equals(header);
        messageDialogBuilderWorks &= messageDialog.getBody().equals(body);
        messageDialogBuilderWorks &= messageDialog.getPrimaryButtonText().equals(primaryButtonText);
        messageDialogBuilderWorks &= messageDialog.getSecondaryButtonText().equals(secondaryButtontext);
        messageDialogBuilderWorks &= messageDialog.getBgColor().equals(bgColor);
        messageDialogBuilderWorks &= messageDialog.isCancelable() == cancelable;

        System.out.printf(Locale.getDefault(), "Message Dialog Builder works correctly? %b", messageDialogBuilderWorks);
    }
}
