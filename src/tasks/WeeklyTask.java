package tasks;

import exception.IncorrectArgumentException;

import java.time.LocalDate;
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
    public boolean appearsIn(LocalDate dateForChecking) {
        return (dateForChecking.isAfter(getDateTime().toLocalDate()) || dateForChecking.isEqual(getDateTime().toLocalDate())) && dateForChecking.getDayOfWeek() == getDateTime().getDayOfWeek();
    }
}
