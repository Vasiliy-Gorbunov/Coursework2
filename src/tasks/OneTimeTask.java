package tasks;

import exception.IncorrectArgumentException;

import java.time.LocalDateTime;

public class OneTimeTask extends Task{
    public OneTimeTask(String title, Type type, String description){
        super(title, type, description);
    }

    public OneTimeTask(String title, Type type, LocalDateTime dateTime, String description){
        super(title, type, dateTime, description);
    }

    @Override
    public LocalDateTime appearsIn() {
        return null;
    }
}
