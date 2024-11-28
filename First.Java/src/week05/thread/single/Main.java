package week05.thread.single;

public class Main {
    public static void main(String[] args) {
        // 람다식으로 표현
        // 반복문이 tast에 담김. 즉 이  반복문은 run()을 익명함수로 구현한 것
        Runnable task = () -> {
            // 밑에서 지정한 이름인 thread1이 출력
            System.out.println("2번 => " + Thread.currentThread().getName());
            for (int i = 0; i<100; i++) {
                System.out.print("$");
            }
        };

        // 현재 실행중인 스레드의 이름
        // main에서 돌아가ㅗ 잇으니까 main이 출력
        System.out.println("1번 => " + Thread.currentThread().getName());

        // 스레드가 하나밖에 없으니까 싱글스레드
        Thread threadA = new Thread(task);
        threadA.setName("thread1");

        threadA.start();
    }
}
