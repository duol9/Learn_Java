package week02.collection;

import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        //List
        // 순서가 있는 데이터의 집합 -> Array
        // 처음에 길이를 몰라도 만들 수 있음. 크기가 가변적으로 늘어남(정적배열)
        // Array는 길이를 알아야 만들 수 있음 (동적배열)

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(99);
        intList.add(15);
        intList.add(3);

        System.out.println(intList.get(2));

        // 0번째 있는 값을 바꿔보자
        intList.set(0, 10);
        System.out.println(intList.get(0));

        // 0번째 있는 값 삭제
        intList.remove(0);
        System.out.println(intList.get(0));

        System.out.println("클리어 전");
        System.out.println(intList.toString());
        intList.clear();
        System.out.println("클리어 후");
        System.out.println(intList.toString());

    }
}
