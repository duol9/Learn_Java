package week02.loof;

import java.util.Scanner;

public class W2_17 {
    public static void main(String[] args) {
        //입력받느 단을 제외하고 출력!!
        Scanner sc = new Scanner(System.in);
        int passNum = sc.nextInt(); //출력을 제외할 구구단수 값
        //구구단 만들기
        for (int i=0; i<=9; i++) {  //구구단 첫 번째 수
            if (i == passNum) {
                continue;
            }
            for (int j = 0; i<=9; j++) {  //구구단 두 번째 수
                System.out.println(i + "곱하기" + j + "는" + (i*j) + "입니다.");

            }
        }
    }
}
