package week02.array;

import java.util.Arrays;

public class W2_20 {
    public static void main(String[] args) {
        // 얕은 복사
        int[] a = {1, 2, 3 ,4, 5};
        int[] b = a; // 얕은 복사

        b[0] = 3;// b 배열의 0번째 순번값을 3으로 수정 (1 -> 3)

        System.out.println(a[0]);

        // 2. 깊은 복사, Arrays.copyOf() 메소드
        int[] a2 = {1, 2, 3, 4};
        int[] b2 = Arrays.copyOf(a2, a2.length); //새로운 배열과 함께 length값도 같이 넣어줌

        a2[3] = 0;
        System.out.println(a2[3]);
        System.out.println(b2[3]);

    }
}
