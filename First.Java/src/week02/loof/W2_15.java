package week02.loof;

public class W2_15 {
    public static void main(String[] args) {
        // for 문
        // 초기값 ; week02.조건문; 증가연사
        for (int i = 0; i < 4; i++) {
            System.out.println(i + " 번째 출력!");
        }

        //향상된 for문
        //기존 : for문 안에 3개의 표현이 들어감 -> (초기값;week02.조건문;증가연산)
        //향상된 : 2개로 줄여줌
        int[] numbers = {3, 6, 9, 12, 15};
        for(int number : numbers) {
            System.out.println(number + " ");
        }

        int[] num = {3, 6, 9, 12, 15};
        for (int i = 0; i< num.length; i++)
            System.out.println(num[i]);
    }
}
