package hbv202g_LibrarySystem;

public class UserOrBookDoesNotExistException extends Exception {
    public UserOrBookDoesNotExistException(String message) {
        super(message);
    }
}
