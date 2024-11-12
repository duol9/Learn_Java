package week02.array;

import java.util.Arrays;

public class W2_19 {
    public static void main(String[] args) {
        //초기화

        // 1. 배열에 특정값 대입해서 선언
        int[] intArr = {1, 2, 3, 4, 5};
        String[] stringArr = {"a", "b", "c", "d"};

        // 2. for 문을 통해서 대입
        for(int i = 0; i<intArr.length; i++){
            intArr[i] = i;
            System.out.println(intArr[i]);
        }

        System.out.println("----");

        for (int item : intArr) {
            System.out.println(item);
        }

        //배열의 주솔르 모두 같은 값으로 초기화
        Arrays.fill(intArr, 1);

        for (int item: intArr) {
            System.out.println(item);  //모두 1로 나옴
        }
    }
}
