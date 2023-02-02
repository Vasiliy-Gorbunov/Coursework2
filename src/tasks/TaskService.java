package tasks;

import exception.TaskNotFoundException;

import java.time.LocalDate;
import java.util.*;

public class TaskService {
    private Map<Integer, Task> taskMap = new HashMap<>();
    private Set<Task> removedTasks = new HashSet<>();

    public void add(Task task) {
        taskMap.put(task.getId(), task);
    }

    public Task remove(int id) {
        Task removedTask = taskMap.get(id);
        removedTasks.add(removedTask);
        taskMap.remove(id);
        return removedTask;
    }

    public LinkedList<Task> getAllByDate(LocalDate localDate) throws TaskNotFoundException {
        LinkedList<Task> tasksByDate = new LinkedList<>();
        for (Task value : taskMap.values()) {
            if (value.getDateTime().toLocalDate() == localDate) {
                tasksByDate.add(value);
            }
        }
        if (tasksByDate.isEmpty()) {
            throw new TaskNotFoundException();
        } else {
            return tasksByDate;
        }
    }
}
