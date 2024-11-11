import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // public : 외부에서 실행시킬 수 있음
    // static : 이 프로그램이 시작될 때 무조건 실행됨

    // output
    // void : 메서드의 출력값의 데이터 타입 부분인데 void는 출력이 없다는 뜻

    // input
    // String[] : 매개변수 자리
    public static void main(String[] args) {

        // 객체 : 특징 (속성, 변수), 행동(메소드)

        //print -> 줄 바꿈x
        //println -> 줄 바꿈O
        // ln -> line
        System.out.println("Our First Project! :) ");

        //mission
        // 1. 7
        // 2. 3
        // 3. 3.14
        // 4. JAVA
        System.out.println(7);
        System.out.println(3);
        System.out.println(3.14);
        System.out.println("JAVA");

        // 기본형
        // 1-(1) 논리형 boolean
        // 변수를 선언해보자 -> 타입이름 = 값;
        boolean flag = true;
        System.out.println(flag);

        // 1-(2) 문자형(char)
        char alphabet = 'A';    // 쌍따옴표로 하면 문자열로 인식
        System.out.println(alphabet);

        // 1-(3) 정수형(byte, int, short, long)
        byte byteNumber = 127; // -128 ~ 127
        short shortNumber = 32767; // -32,768 ~ 32,767
        int intNumber = 214748347;
        long longNumber = 2147483647L;

        System.out.println(byteNumber);
        System.out.println(shortNumber);
        System.out.println(intNumber);
        System.out.println(longNumber);

        // 1-(4) 실수형 (float(4byte), double(8byte))
        float floatNumber = 0.123F;
        double doubleNumber = 0.123123132;

        System.out.println(floatNumber);
        System.out.println(doubleNumber);

        // 참조형
        // 2-(1) 문자열
        String helloWorld = "Hello World!";
        System.out.println(helloWorld);

        // 2-(2) 배열
        int[] a = {1, 2, 3};
        System.out.println(Arrays.toString(a));

        // 3. 래퍼 클래스
        // new Integer()로 감싸는 방식은 jdk 9에서 지원 종료 됨.
        int number = 21;
        Integer num = number;  // 박싱
        System.out.println(num.intValue()); // 언박싱

        Scanner sc = new Scanner(System.in);

        // 4. 문자를 숫자로
        int asciiNumber = sc.nextInt();
        char c = (char)asciiNumber; // 문자로 형변환을 해주면 숫자에 맞는 문자로 표현
        System.out.println(c);

        // 5. 숫자를 문자로
        char letter  = sc.nextLine().charAt(0);   //입력 받은 문자열 중 첫번째 글자만 받아옴
        int asciiNumber2 = (int)letter;            // 숫자로 형변환을 해주면 아스키 코드로 표현됨

        System.out.println(asciiNumber2);

        // 6. 형 변환
        // 6-(1). double형 or float형 -> int
        double doubleNum = 10.101010;
        float floatNum = 10.1010f;

        int intNum;
        intNum = (int)doubleNum;

        System.out.println("Float Type => " + doubleNum);
        System.out.println("Int Type => " + intNum);

        /*intNum = (int)floatNum;
        System.out.println("Float Type => " + floatNum);
        System.out.println("Int Type => " + intNum); */

        // 6-(2). 정수 -> 실수
        int intNum2 = 10;

        double doubleNumber2 = (double)intNum2; // int -> double 형변환
        float floatNumber2 = (float)intNum2;  // int -> float 형변환

        // 7. 자동 형변환
        // 7-(1).
        byte byteNumber7 = 10;
        int intNumber7 = byteNumber7;    // byte -> int 형변환
        System.out.println(intNumber7); // 10

        char charAlphabet7 = 'A';
        intNumber7 = charAlphabet7;   // char -> int 형변환
        System.out.println(intNumber7); // A의 유니코드 : 65

        intNumber7 = 100;
        long longNumber7 = intNumber7; // int -> number 형변환
        System.out.println(longNumber7); // 100

        intNumber7 = 200;
        double doubleNumber7 = intNumber7; // int -> double 형변환
        System.out.println(doubleNumber7); // 200.0  (소수점이 추가된 실수출력)

    }
}