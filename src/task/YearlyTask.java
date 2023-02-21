package task;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.Period;

public class YearlyTask extends Task{


    public YearlyTask() {

    }

    public boolean appearsIn(LocalDate date) {
        Period period = Period.between(getDateTime().toLocalDate(), date);
        return period.getYears() >= 0 && period.getMonths() == 0 && period.getDays() == 0;
    }
}
