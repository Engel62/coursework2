package Task;

import java.lang.reflect.Type;
import java.time.LocalDate;

public class WeeklyTask extends Task{
    public WeeklyTask(String description, int idGenerator, String dateTime, Type type, String title, int id) {
        super(description, idGenerator, dateTime, type, title, id);
    }
    public boolean appearsIn(LocalDate date) {
        return true;
    }
}
