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
        TaskService.add(new WeeklyTask("Стирка", PERSONAL, LocalDateTime.of(2023,2,5, 12, 20), "Нужно постирать вещи"));
        TaskService.add(new WeeklyTask("Чистка", PERSONAL, LocalDateTime.of(2023,2,5, 12, 30), "Нужно почистить обувь"));
        TaskService.add(new WeeklyTask("Готовка", PERSONAL, LocalDateTime.of(2023,2,5, 12, 40), "Нужно приготовить ужин"));
        TaskService.add(new WeeklyTask("Уборка", PERSONAL, LocalDateTime.of(2023,2,6, 12, 10), "Нужно убраться в комнате"));
        TaskService.add(new WeeklyTask("Стирка", PERSONAL, LocalDateTime.of(2023,2,6, 12, 20), "Нужно постирать вещи"));
        TaskService.add(new WeeklyTask("Чистка", PERSONAL, LocalDateTime.of(2023,2,6, 12, 30), "Нужно почистить обувь"));
        TaskService.add(new WeeklyTask("Готовка", PERSONAL, LocalDateTime.of(2023,2,6, 12, 40), "Нужно приготовить ужин"));
        TaskService.add(new WeeklyTask("Уборка", PERSONAL, LocalDateTime.of(2023,2,7, 12, 10), "Нужно убраться в комнате"));
        TaskService.add(new WeeklyTask("Стирка", PERSONAL, LocalDateTime.of(2023,2,7, 12, 20), "Нужно постирать вещи"));
        TaskService.add(new WeeklyTask("Чистка", PERSONAL, LocalDateTime.of(2023,2,7, 12, 30), "Нужно почистить обувь"));
        TaskService.add(new WeeklyTask("Готовка", PERSONAL, LocalDateTime.of(2023,2,7, 12, 40), "Нужно приготовить ужин"));
//        System.out.println(TaskService.getAllByDate(LocalDate.of(2023, 2, 5)));
        System.out.println(TaskService.getAllGroupByDate());


//        for (Map.Entry<Integer, Task> integerTaskEntry : TaskService.taskMap.entrySet()) {
//            System.out.println(integerTaskEntry.getKey());
//        }
    }
}