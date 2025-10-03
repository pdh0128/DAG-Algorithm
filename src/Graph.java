import tasks.Task;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {
    private String dataPipeLineName;
    private Queue<Task> waitingQueue = new LinkedList<>();
    private List<Task> taskList = new ArrayList<>();

    public Graph(String dataPipeLineName) {
        this.dataPipeLineName = dataPipeLineName;
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public void run() {
        System.out.println(this.dataPipeLineName + " 데이터 파이프라인 실행");

        // 시작점인 태스크들을 대기열에 추가
        for (Task task : taskList) {
            if (task.isFirst()) {
                this.waitingQueue.add(task);
            }
        }

        // 대기열이 비어있을 때까지 태스크 실행
        while (!waitingQueue.isEmpty()) {
            Task currentTask = waitingQueue.poll();
            currentTask.run();

            // 다음 태스크가 있으면 대기열에 추가
            if (currentTask.nextTask() != null) {
                waitingQueue.add(currentTask.nextTask());
            }
        }
    }


}
