package Task;

import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Objects;

public class Task {
    private String description;
    private int idGenerator;
    private String dateTime;
    private Type type;
    private  String title;
    private static int counter = 0;
    private int id;

    public Task(String description, int idGenerator, String dateTime, Type type, String title, int id) {
        this.description = description;
        this.idGenerator = idGenerator;
        this.dateTime = dateTime;
        this.type = type;
        this.title = title;
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public int getIdGenerator() {
        return idGenerator;
    }

    public String getDateTime() {
        return dateTime;
    }

    public Type getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return idGenerator == task.idGenerator && id == task.id && Objects.equals(description, task.description) && Objects.equals(dateTime, task.dateTime) && Objects.equals(type, task.type) && Objects.equals(title, task.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, idGenerator, dateTime, type, title, id);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
