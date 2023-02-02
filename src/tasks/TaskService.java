package tasks;

import exception.IncorrectArgumentException;
import exception.TaskNotFoundException;

import java.time.LocalDate;
import java.util.*;

public class TaskService {
    private static Map<Integer, Task> taskMap = new HashMap<>();
    private static List<Task> removedTasks = new ArrayList<>();

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

    public static List<Task> getRemovedTasks() {
        return removedTasks;
    }

    public static Task updateTitle(int id, String title){
        taskMap.get(id).setTitle(title);
        return taskMap.get(id);
    }
    public static Task updateDescription(int id, String description){
        taskMap.get(id).setDescription(description);
        return taskMap.get(id);
    }

    public static Map<LocalDate, List<Task>> getAllGroupByDate() {
        Map<LocalDate, List<Task>> dateListMap = new TreeMap<>();
        for (Task value : taskMap.values()) {
            List<Task> tasks = dateListMap.getOrDefault(value.getDateTime().toLocalDate(), new ArrayList<>());
            tasks.add(value);
            dateListMap.put(value.getDateTime().toLocalDate(), tasks);
        }
        return dateListMap;
    }
}
