import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String foodName = sc.nextLine();

        float foodStar = sc.nextFloat();
        int foodScore = (int)foodStar;          // float -> int

        float percent = (foodScore / 5.0f) * 100;

        sc.nextLine(); // 버퍼 비우기

        String[] str = new String[10];
        for(int i=0; i<10; i++) {
            str[i] = sc.nextLine();
        }

        System.out.println("[ " + foodName + " ]");  // 요리 제목 출력
        System.out.print("별점 : " + foodScore);  // 실수 -> 정수로 형변환, 줄바꿈 없이 출력
        System.out.println(" (" + String.format("%.1f", percent) + "%)");   // 소수점 한 자리 수까지만 출력

        for(int i = 0; i <10; i++) {
            System.out.println((i+1) + ". " +  str[i]);
        }
    }
}