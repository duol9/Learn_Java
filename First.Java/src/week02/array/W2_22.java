package week02.array;

public class W2_22 {
    public static void main(String[] args) {

        //반복문을 통한 초기화
        int [][] array = new int[2][3];

        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                System.out.println("출력값 => " + i + ", " + j);
                array[i][j] = 0;   //i, j는 인덱스를 의미
            }
        }
    }
}
