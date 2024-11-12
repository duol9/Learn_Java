package week02.operator;

public class W2_04 {
    public static void main(String[] args) {
        //논리 week02.연산자
        //비교 연산의 결과값으로 받을 수 있는 boolean 값을 연결하는 week02.연산자
        //조건을 연결 하였을 때 boolean 값들을 조합하여 참(true) 또는 거짓(false) 값인 boolean 값을 출력

        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = false;

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);

        // (1) 피연산자 중 하나라도  true이면 true => 또는 ( OR : || )
        System.out.println("----------------");
        System.out.println(flag1 || flag2); //true
        System.out.println(flag1 || flag2 || flag3); // true

        // (2) 피연산자 모두 true라면 true => 그리고 ( And : && )
        System.out.println("----------------");
        System.out.println(flag1 && flag2); // true
        System.out.println(flag1 && flag2 && flag3); // false

        // (3) AND
        System.out.println("AND----------------");
        System.out.println((5 > 3) && (3 > 1)); //true
        System.out.println((5 > 3) && (3 < 1)); //false

        // (4) OR
        System.out.println("OR----------------");
        System.out.println((5 > 3) || (3 > 1)); //true
        System.out.println((5 > 3) || (3 < 1)); //true
        System.out.println((5 < 3) || (3 < 1)); //false

        // (5) 논리 부정 week02.연산자 ( ! : NOT )
        System.out.println("!----------------");
        System.out.println(!flag1); // false
        System.out.println(!flag3); // true
        System.out.println(!(5 == 5)); // false
        System.out.println(!(5 == 3)); // true
    }
}
