package exception;

public class TaskNotFoundException extends Exception {
    @Override
    public String getMessage() {
        return "На указанную дату нет задач!";
    }
}
