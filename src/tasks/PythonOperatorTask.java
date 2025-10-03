package tasks;

public class PythonOperatorTask extends Task {
    public PythonOperatorTask(String taskName) {
        super(taskName);
    }

    @Override
    public void run() {
        System.out.println(super.taskName +  " 파이썬 커스텀 로직 수행");
        this.state = TaskState.CLOSE;
    }

}
