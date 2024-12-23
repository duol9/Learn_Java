package week02.collection;

import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        // 집합 : 순서 없고, 중복 없음
        // 순서가 보장되지 않는 대신 중복을 허용하지 않도록 하는 프로그램에서 사용할 수 있는 자료구조
        // Set -> 그냥 쓸 수도 있움, 그러나, HashSet, TreeSet 등으로 응용해서 같이 사용 가능
        // Set은 생성자가 없는 대신 껍데기라서 바로 생성할 수 있움
        // 생성자가 존재하는 HashSet을 이용해서 -> Set을 구현해 볼 수 있음

        Set<Integer> intSet = new HashSet<>(); // 선언 및 생성

        intSet.add(1);
        intSet.add(12);
        intSet.add(5);
        intSet.add(9);
        intSet.add(1);
        intSet.add(12);

        for (Integer value: intSet) {
            System.out.println(value);
        }

        //contains  요소가 존재하는 지 검사
        System.out.println(intSet.contains(2));
        System.out.println(intSet.contains(5));
    }
}
