package week05.thread.stat.inturrpt;

// 쓰레드가 start() 된 후 동작하다 interrupt()를 만나 실행하면 interrupted 상태가 true가 됨
public class Main {
    public static void main(String[] args) {
        /*Runnable task = () -> {
            try {
                // sleep 도중 interrupt 발생 시, catch함
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "Thread");
        thread.start();

        // sleep 단계에 있을 때 inturrupt가 발생하면 InterruptedException이 발생함
        thread.interrupt();

        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());*/

        Runnable task = () -> {
            // !Thread.currentThread().isInterrupted()로 interrupted 상태를 체크해서 처리하면 오류를 방지할 수 있음
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    break;
                }
            }
            System.out.println("task : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "Thread");
        thread.start();

        thread.interrupt();

        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());

    }
}