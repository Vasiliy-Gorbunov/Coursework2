package tasks;

import java.time.LocalDateTime;

public class DailyTask extends Task{
    public DailyTask(String title, Type type, String description){
        super(title, type, description);
    }

    public DailyTask(String title, Type type, LocalDateTime dateTime, String description){
        super(title, type, dateTime, description);
    }

    @Override
    public LocalDateTime appearsIn() {
        return getDateTime().plusDays(1);
    }
}
