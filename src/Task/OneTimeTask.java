package Task;

import java.lang.reflect.Type;
import java.time.LocalDate;

public class OneTimeTask extends Task{
    public OneTimeTask(String description, int idGenerator, String dateTime, Type type, String title, int id) {
        super(description, idGenerator, dateTime, type, title, id);
    }

    public boolean appearsIn(LocalDate date) {
        return true;
    }
}
