package tasks;

import exception.IncorrectArgumentException;

import java.time.LocalDateTime;

public class YearlyTask extends Task{
    public YearlyTask(String title, Type type, String description) throws IncorrectArgumentException {
        super(title, type, description);
    }

    public YearlyTask(String title, Type type, LocalDateTime dateTime, String description) throws IncorrectArgumentException {
        super(title, type, dateTime, description);
    }

    @Override
    public LocalDateTime appearsIn() {
        return getDateTime().plusYears(1);
    }
}
