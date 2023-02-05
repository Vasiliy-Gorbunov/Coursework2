package tasks;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DailyTask extends Task{
    public DailyTask(String title, Type type, String description){
        super(title, type, description);
    }

    public DailyTask(String title, Type type, LocalDateTime dateTime, String description){
        super(title, type, dateTime, description);
    }

    @Override
    public boolean appearsIn(LocalDate dateForChecking) {
        return (dateForChecking.isAfter(getDateTime().toLocalDate()));
    }
}
