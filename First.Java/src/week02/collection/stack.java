package week02.collection;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        //Stack
        //수직으로 값을 쌓아놓고, 넣었다가 뺜다. FILO
        //push, peek, pop
        //최근 저장된 데이터를 나열하고 싶거나, 데이터의 중복 처리를 막고 싶을 때 사용

        Stack<Integer> intStack = new Stack<Integer>();

        intStack.push(30);
        intStack.push(15);
        intStack.push(1);

        // 다 지워질 때까지 출력
        while(!intStack.isEmpty()){
            System.out.println(intStack.pop());  // 1 -> 15 -> 10 순으로
        }

        //다시 추가
        intStack.push(30);
        intStack.push(15);
        intStack.push(1);

        //peak
        System.out.println(intStack.peek());  //맨 위 값 조회, 결과 -> 1
        System.out.println(intStack.size());
    }
}
