package task;
import java.time.LocalDate;
import java.util.Objects;

public class OneTimeTask extends Task{
    public boolean appearsIn(LocalDate date) {
        return Objects.equals(getDateTime().toLocalDate(), date);
    }
}
