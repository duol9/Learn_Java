package week05.thread;

public class Main {
    public static void main(String[] args) {
        // Thread를 상속
        TestThread thread = new TestThread();
        thread.run();

        // Thread를 구현
        Runnable runnable = new TestRunnable();
        Thread thread1 = new Thread(runnable);

        thread1.run();

        // 람다식으로 표현
        Runnable task = () -> {
            int sum = 0;
            for (int i = 0; i < 50; i++) {
                sum += i;
                System.out.println(sum);
            }
            System.out.println(Thread.currentThread().getName() + " 최종 합 : " + sum);
        };

        Thread threadA = new Thread(task);
        threadA.setName("thread1");
        Thread threadB = new Thread(task);
        threadB.setName("thread2");

        threadA.start();
        threadB.start();
    }
}
