package week02.loof;

public class W2_16 {
    public static void main(String[] args) {
        int number = 0;

        while(number<3) {   //number < 3인 동안~~
            number++;
            System.out.println(number + "출력!");
        }

        //do ~ while
        int num = 4;
        do {
            System.out.println(number + "출력!");
        }while(num < 3);

        //break
        // 가장 가까운 블록의 for문 또는 while, switch문 중단
        int numb = 0;
        while (numb < 3) {
            numb++;
            if(numb == 2) {
                break;
            }
            System.out.println(numb + "출력!");
        }

        for(int i = 0; i<10; i++) {
            System.out.println("i: " + i);
            if (i == 2){  // i == 2일 때, 가장 바깥 week02.반복문 종료
                break;
            }
            for (int j = 0; j<10; j++) {
                System.out.println("j: " + j);
                if (i == 2) {  // j가 2일 때, 안쪽 week02.반복문 종료
                    break;
                }
            }
        }

        int numc = 0;
        while (numc < 3) {
            numc++;
            if (numc == 2) {
                continue;
            }
            System.out.println(numc + "출력!");
        }
    }
}
