package task;



import java.time.LocalDate;

public class DailyTask extends Task{
    public boolean appearsIn(LocalDate date) {
        return true;
    }
}
