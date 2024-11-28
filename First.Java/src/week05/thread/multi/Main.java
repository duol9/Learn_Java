package week05.thread.multi;

// 멀티스레드, 병렬적으로 실행
public class Main {
    public static void main(String[] args) {

        // 1번째로 실행
        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("$");
            }
        };

        // 2번째로 실행
        Runnable task2 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("*");
            }
        };


        Thread thread1 = new Thread(task);
        thread1.setName("thread1");
        Thread thread2 = new Thread(task2);
        thread2.setName("thread2");

        thread1.start();
        thread2.start();
    }
}
