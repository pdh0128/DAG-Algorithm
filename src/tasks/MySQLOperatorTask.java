package tasks;

public class MySQLOperatorTask extends Task {
    public MySQLOperatorTask(String taskName) {
        super(taskName);
    }

    @Override
    public void run() {
        System.out.println(super.taskName +  " MYSQL 로직 수행");
        this.state = TaskState.CLOSE;
    }
}

