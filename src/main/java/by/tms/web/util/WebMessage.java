package by.tms.web.util;

public final class WebMessage {
    public static final String ERROR_MESSAGE = "check path and try again:)";
    public static final String STORAGE_IS_EMPTY = "storage is empty";
    public static final String OPERATION_NOT_FOUND = "operation not found";
    public static final String USER_NOT_FOUND = "user not found";
    public static final String WRONG_PASSWORD = "wrong password";
    public static final String INVALID_INFO = "invalid info";
    public static final String HELLO_MESSAGE = "hello, %s!";
    public static final String NEW_NAME_MESSAGE = "your new name %s";
    public static final String NEW_PASSWORD_MESSAGE = "your new password %s";
    public static final String OPERATION_WAS_REMOVED = "operation was removed";
    public static final String OPERATIONS_WERE_REMOVED = "operations were removed";
    public static final String AUTHORIZATION_EXAMPLE = "localhost:8080/authorization?username=USERNAME&password=PASSWORD";
    public static final String REGISTRATION_EXAMPLE = "localhost:8080/registration?name=NAME&username=USERNAME&password=PASSWORD";
    public static final String HISTORY_MENU = " - history" +
            "\nlocalhost:8080/showingAll -> get all info" +
            "\nlocalhost:8080/showingById -> get info by id" +
            "\nlocalhost:8080/removingAll -> remove all info" +
            "\nlocalhost:8080/removingById -> remove info by id";

    public static final String CALCULATOR_MENU = " - calculator" +
            "\nexample: localhost:8080/calculate?numbers=22,33,44,1&type=sum" +
            "\nsum -> +" +
            "\nsub -> -" +
            "\nmul -> *" +
            "\ndiv -> /";

    public static final String NAME_PASSWORD_CHANGE_MESSAGE = " - %s can change name or password" +
            "\nhttp://localhost:8080/nameChange?name=NEW_NAME" +
            "\nhttp://localhost:8080/passwordChange?password=NEW_PASSWORD";

    public static final String MAIN_MENU = "%s, go to main page" +
            "\nhttp://localhost:8080/main";
}
