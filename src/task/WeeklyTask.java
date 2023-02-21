package task;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class WeeklyTask extends Task{

    public boolean appearsIn(LocalDate date) {
        long daysBetween = ChronoUnit.DAYS.between(getDateTime().toLocalDate(), date);
        return (daysBetween >= 0 && daysBetween % 7 == 0);
    }
}
