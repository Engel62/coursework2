package enums;

import task.DailyTask;
import task.OneTimeTask;
import task.Task;
import task.WeeklyTask;
import task.YearlyTask;
import task.MounthlyTask;

public enum TaskPeriodicity {
    ONETIME {
        @Override
        public Task createTask() {
            return new OneTimeTask();
        }
    },
    DAILY {
        @Override
        public Task createTask() {
            return new DailyTask();
        }
    },
    WEEKLY {
        @Override
        public Task createTask() {
            return new WeeklyTask();
        }
    },
    MONTHLY  {
        @Override
        public Task createTask() {
            return new MounthlyTask();
        }
    },
    YEARLY {
        @Override
        public Task createTask() {
            return new YearlyTask();
        }
    };

    public abstract Task createTask();
}
