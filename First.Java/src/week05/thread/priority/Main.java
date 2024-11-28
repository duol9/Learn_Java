package week05.thread.priority;

public class Main {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("$");
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("*");
            }
        };

        Thread thread1 = new Thread(task1);
        thread1.setPriority(8); // 우선순위 8, 우선순위가 높다
        int threadPriority = thread1.getPriority();
        System.out.println("threadPriority = " + threadPriority);

        Thread thread2 = new Thread(task2);
        thread2.setPriority(2); // 우선순위 2.

        // 출력할 때는 작업량의 차이가 유의미하지 않는데 그 이유는 이 프로그램이 작기 때문이다
        thread1.start();
        thread2.start();
    }
}