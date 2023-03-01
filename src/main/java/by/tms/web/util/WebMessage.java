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
    public static final String OPERATION_WAS_REMOVED = "operation was removed";
    public static final String OPERATIONS_WERE_REMOVED = "operations were removed";
    public static final String AUTHORIZATION_EXAMPLE = "localhost:8080/authorization?name=NAME&username=USERNAME&password=PASSWORD";
    public static final String CALCULATOR_AND_HISTORY_MENU = " - calculator" +
            "\nexample: localhost:8080/calculate?numbers=22,33,44,1&type=sum" +
            "\nsum -> +" +
            "\nsub -> -" +
            "\nmul -> *" +
            "\ndiv -> /" +
            "\n" +
            "\n- history" +
            "\nlocalhost:8080/showingAll -> get all info" +
            "\nlocalhost:8080/showingById -> get info by id" +
            "\nlocalhost:8080/removingAll -> remove all info" +
            "\nlocalhost:8080/removingById -> remove info by id";
}
