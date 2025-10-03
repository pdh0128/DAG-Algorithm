package tasks;

public class Task {
    protected TaskState state = TaskState.OPEN;
    protected String taskName;
    private Task nextTask;
    private Task previousTask;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    public void nextTask(Task nextTask) {
        this.nextTask = nextTask;
        if (nextTask != null) {
            nextTask.previousTask = this;
        }
    }

    public Task nextTask() {
        return this.nextTask;
    }

    public void run() {
        System.out.println(this.taskName +  " 로직 수행");
        this.state = TaskState.CLOSE;
    }

    public void init() {
        this.state = TaskState.OPEN;
    }

    public boolean isFirst() {
        return previousTask == null;
    }


    public boolean isClosed() {
        return state == TaskState.CLOSE;
    }
}
