package task;

import java.lang.reflect.Type;
import java.time.LocalDate;

public class WeeklyTask extends Task{

    public boolean appearsIn(LocalDate date) {
        return true;
    }
}
