package tasks;

import exception.IncorrectArgumentException;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Task {
    public enum Type {
        WORK,
        PERSONAL
//        public Type[] values() {
//            Type[] values = new Type[];
//            return
//        }
//        public Type valuesOf(String) {
//
//        }
    }

    private static int idGenerator = 0;
    private String title;
    private final Type type;
    private final int id;
    private final LocalDateTime dateTime;
    private String description;

    public Task(String title, Type type, String description) {
        this(title,type,LocalDateTime.now(),description);
    }

    public Task(String title, Type type, LocalDateTime dateTime, String description) {
        idGenerator = idGenerator + 1;
        try {
            setTitle(title);
            setDescription(description);
        } catch (IncorrectArgumentException e) {
            throw new RuntimeException(e);
        }
        this.type = type;
        this.id = idGenerator;
        this.dateTime = dateTime;
    }

    public abstract LocalDateTime appearsIn();

    public String getTitle() {
        return title;
    }

    public Type getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) throws IncorrectArgumentException {
        if (title == null || title.isEmpty() || title.isBlank()) {
            throw new IncorrectArgumentException(title);
        }
        this.title = title;
    }

    public void setDescription(String description) throws IncorrectArgumentException {
        if (description == null || description.isEmpty() || description.isBlank()) {
            throw new IncorrectArgumentException(title);
        }
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id && Objects.equals(title, task.title) && type == task.type && Objects.equals(dateTime, task.dateTime) && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, type, id, dateTime, description);
    }

    @Override
    public String toString() {
        return "tasks.Task № " + id + ":\n " +
                "Название: " + title + "\n " +
                "Тип задачи: " + type.name() + "\n " +
                "Время выполнения: " + dateTime + "\n " +
                "Описание: " + description;
    }
}
