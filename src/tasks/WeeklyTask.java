package tasks;

import exception.IncorrectArgumentException;

import java.time.LocalDateTime;
import java.util.Objects;

public class WeeklyTask extends Task{
    public WeeklyTask(String title, Type type, String description){
        super(title, type, description);
    }

    public WeeklyTask(String title, Type type, LocalDateTime dateTime, String description){
        super(title, type, dateTime, description);
    }

    @Override
    public LocalDateTime appearsIn() {
        return getDateTime().plusWeeks(1);
    }
}
