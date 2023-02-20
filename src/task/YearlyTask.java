package task;

import java.lang.reflect.Type;
import java.time.LocalDate;

public class YearlyTask extends Task{


    public YearlyTask() {

    }

    public boolean appearsIn(LocalDate date) {
        return true;
    }
}
