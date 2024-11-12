package week02.array;

public class W2_23 {
    public static void main(String[] args) {

        // 가변 배열
        int[][] array = new int[3][];

        //배열 원소마다 각기 다른 크기로 지정
        array[0] = new int[2];
        array[1] = new int[4];
        array[2] = new int[1];

        // 중괄호로 초기화를 아예 해버릴 때도 가능
        int[][] array2 = {
                {10, 20},
                {30, 40},
                {50, 60}
        };
    }
}
