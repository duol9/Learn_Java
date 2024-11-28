package week05.thread.stat.sleep;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                // (1) 예외처리 필수
                // - interrupt() 를 만나면 다시 실행되기 때문에
                // - InterruptedException이 발생할 수 잇음
                // sleep는 static임
                Thread.sleep(2000); // TIMED_WAITING (주어진 시간 동안만 기다리는 상태)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "Thread"); // NEW
        thread.start(); // NEW => RUNNABLE

        try {
            // 1초가 지나고 나면 runnable 상태로 변해서 다시 실행됨
            // 특정 스레드를 지목해서 멈추게 하는 건 불가능함
            thread.sleep(1000);  // 객체로 만든 스레들르 1초동안 재움
            System.out.println("sleep(1000) : " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
