package task;



import java.time.LocalDate;

public class DailyTask extends Task{
    public boolean appearsIn(LocalDate date) {
        return date.equals(getDateTime().toLocalDate()) || date.isAfter(getDateTime().toLocalDate());
    }
}
