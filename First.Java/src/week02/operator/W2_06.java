package week02.operator;

public class W2_06 {
    public static void main(String[] args) {
        //대입 연산자에서 주의해야 할 점
        // ++, --
        int a = 10;
        int b = 10;
        int val = ++a + b--;  // ++a 연산 전 덧셈, b-- 연산 후 뺄셈
        System.out.println(val);  //21

    }
}
