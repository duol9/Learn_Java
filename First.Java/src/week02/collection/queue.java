package week02.collection;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        // Queue : FIFO
        // add, peek, poll
        // Queue : 생성자가 없는 인터페이스 <-

        Queue<Integer> intQueue = new LinkedList<>(); //queue 선언, 생성

        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);

        while(!intQueue.isEmpty()) {
            System.out.println(intQueue.poll());
        }

        // 추가
        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);
        intQueue.add(10);

        // peek
        System.out.println(intQueue.peek()); //맨 위에 값 조회. 출력 결과 1
        System.out.println(intQueue.size()); //사이즈 조회. 출력 결과 4


    }
}
