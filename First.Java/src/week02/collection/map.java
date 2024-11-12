package week02.collection;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        // Map : Key - Value 쌍
        // Key라는 값으로 유니크하게 보장이 돼야 함
        // Map -> HashMap, TreeMap으로 응용

        Map<String, Integer> intMap = new HashMap<>();

        //키 값
        intMap.put("일", 11);
        intMap.put("이", 12);
        intMap.put("삼", 13);
        intMap.put("삼", 14);
        intMap.put("삼", 15);  // 중복 Key, 마지막 값으로 덮어 씀

        // Key 값 전체 출력 (향상된 for문)
        for (String key: intMap.keySet()){
            System.out.println(key);
        }

        // value 값 전체 출력 (향상된 for문)
        for (Integer value: intMap.values()){
            System.out.println(value);
        }

        // Key 값으로 value 조회
        System.out.println(intMap.get("삼"));
    }
}
