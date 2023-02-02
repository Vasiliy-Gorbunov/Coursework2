import static tasks.Task.Type.*;

import tasks.*;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        DailyTask job = new DailyTask("Работа", WORK, LocalDateTime.of(2023, 2, 3, 12, 0), "Пора работать, нигга!");
        System.out.println(job);
    }
}