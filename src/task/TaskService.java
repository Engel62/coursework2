package task;

import exceptions.IncorrectArgumentException;
import exceptions.TaskNotFoundException;
import enums.TaskPeriodicity;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class TaskService {
        private final Map<Integer, Task> taskMap = new HashMap<>();

        public void add(TaskPeriodicity taskPeriodicity) throws IncorrectArgumentException{
            var tp = taskPeriodicity.createTask();
            tp.askData();
            taskMap.putIfAbsent(tp.getId(), tp);
            System.out.println("Задача создана: " + tp);
        }
    public void remove(int id) throws TaskNotFoundException {
        Task task = taskMap.get(id);
        taskMap.values().removeIf(t -> t.getId() == id);
        System.out.printf("Задача %s' была удаленна \n", task);
        if (task == null) {
            throw new TaskNotFoundException("Нет задачи с таким ID: " + id);
        }
    }


        public void getAllByDate(LocalDate localDate) throws TaskNotFoundException {
            for (Map.Entry<Integer, Task> taskMap : taskMap.entrySet()) {
                LocalDate taskDate = taskMap.getValue().getDateTime().toLocalDate();
                if (((LocalDate) taskDate).equals(localDate)) {
                    System.out.println(taskMap.getKey() + " " + taskMap.getValue());
                }
                else if (localDate.isAfter(taskDate) && taskMap.getValue().appearsIn(localDate)) {
                    System.out.println(taskMap.getKey() + " " + taskMap.getValue());
                } else throw new TaskNotFoundException("There is no any task for that date");
            }
        }

        public void listTaskMap() {
            System.out.println("Список задач: ");
            for (Map.Entry<Integer, Task> taskMap : taskMap.entrySet()) {
                System.out.println(taskMap.getKey() + " " + taskMap.getValue());
            }
        }

    }

