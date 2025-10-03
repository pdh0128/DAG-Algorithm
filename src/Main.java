
// DAG 알고리즘 작동 방식
// 1. 그래프 내의 태스크들은 각각 개방된 상태.
// 1.1 각각의 화살표 끝점은 태스크를 향하며, 다음 태스크로 향하기 전에 이전 태스크가 완료 되었는지 확인.
// 1.2 태스크가 완료되면 다음에 실행해야 할 태스크를 대기열에 추가함.
// 2. 실행 대기열에 있는 태스크를 실행하고 태스크 수행이 완료되면 완료 표시를 함.
// 3. 그래프의 모든 태스크가 완료될 때까지 1단계로 돌아감.

public class Main {
    public static void main(String[] args) {
        // 태스크 정의
        Task task = new Task("task 1");
        Task task2 = new Task("task 2");
        task.nextTask(task2);

        Graph graph = new Graph("test task");
        graph.addTask(task);
        graph.addTask(task2);
        graph.run();

    }
}