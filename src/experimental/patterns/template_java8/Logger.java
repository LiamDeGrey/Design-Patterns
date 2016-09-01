package experimental.patterns.template_java8;

/**
 * Created by liamdg on 26/08/16.
 */
public interface Logger {
    int SUCCESS_OK = 200;
    int SUCCESS_ACCEPTED = 202;
    int SUCCESS_NO_CONTENT = 204;

    int ERROR_BAD_REQUEST = 400;
    int ERROR_UNAUTHORIZED = 401;
    int ERROR_FORBIDDEN = 403;
    int ERROR_NOT_FOUND = 404;


    default void onSuccess(final int statusCode) {
        final String successMessage;
        switch (statusCode) {
            case SUCCESS_OK:
                successMessage = "Service request completed without error.";
                break;
            case SUCCESS_ACCEPTED:
                successMessage = "The request has been accepted for processing. Please await a reply.";
                break;
            case SUCCESS_NO_CONTENT:
                successMessage = "Service request was successful, however, nothing has been returned.";
                break;
            default:
                successMessage = "The server request was successful";
                break;
        }
        logMessage(successMessage);
    }

    default void onError(final int statusCode) {
        final String errorMessage;
        switch (statusCode) {
            case ERROR_BAD_REQUEST:
                errorMessage = "The request intended appears to be malformed, please check it's structure.";
                break;
            case ERROR_UNAUTHORIZED:
                errorMessage = "Sorry, but either your username or password was incorrect. Please try again.";
                break;
            case ERROR_FORBIDDEN:
                errorMessage = "Unfortunately you do not have the rights to access this page.";
                break;
            case ERROR_NOT_FOUND:
                errorMessage = "Unfortunately this page is unavailable at the moment. Please try again later.";
                break;
            default:
                errorMessage = "There was an unknown error performing your request, please try again.";
                break;
        }
        logMessage(errorMessage);
    }

    void logMessage(final String message);
}
