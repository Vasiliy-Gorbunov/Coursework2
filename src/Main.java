import static tasks.Task.Type.*;

import tasks.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TaskService.add(new DailyTask("Работа", WORK, LocalDateTime.of(2023, 2, 5, 12, 0), "Пора работать, нигга!"));
        TaskService.add(new WeeklyTask("Уборка", PERSONAL, LocalDateTime.of(2023,2,5, 12, 10), "Нужно убраться в комнате"));
        TaskService.add(new WeeklyTask("Уборка", PERSONAL, LocalDateTime.of(2023,2,5, 12, 10), "Нужно убраться в комнате"));
        TaskService.add(new WeeklyTask("Уборка", PERSONAL, LocalDateTime.of(2023,2,5, 12, 10), "Нужно убраться в комнате"));
        TaskService.add(new WeeklyTask("Уборка", PERSONAL, LocalDateTime.of(2023,2,5, 12, 10), "Нужно убраться в комнате"));
//        System.out.println(TaskService.getAllByDate(LocalDate.of(2023, 2, 5)));
        TaskService.remove(2);
        TaskService.remove(3);
        TaskService.remove(4);
        System.out.println(TaskService.removedTasks);


//        for (Map.Entry<Integer, Task> integerTaskEntry : TaskService.taskMap.entrySet()) {
//            System.out.println(integerTaskEntry.getKey());
//        }
    }
}