package tasks;

import exception.TaskNotFoundException;

import java.time.LocalDate;
import java.util.*;

public class TaskService {
    public static Map<Integer, Task> taskMap = new HashMap<>();
    public static List<Task> removedTasks = new ArrayList<>();

    public static void add(Task task) {
        taskMap.put(task.getId(), task);
    }

    public static Task remove(int id) {
        Task removedTask = taskMap.get(id);
        removedTasks.add(removedTask);
        taskMap.remove(id);
        return removedTask;
    }

    public static LinkedList<Task> getAllByDate(LocalDate localDate) {
        LinkedList<Task> tasksByDate = new LinkedList<>();
        for (Task value : taskMap.values()) {
            if (value.getDateTime().toLocalDate().equals(localDate)) {
                tasksByDate.add(value);
            }
        }
        if (tasksByDate.isEmpty()) {
            try {
                throw new TaskNotFoundException();
            } catch (TaskNotFoundException e) {
                throw new RuntimeException(e);
            }
        } else {
            return tasksByDate;
        }
    }
}
