package task;
import java.time.LocalDate;

public class MounthlyTask extends  Task{
    public boolean appearsIn(LocalDate date) {
        return true;
    }
}
