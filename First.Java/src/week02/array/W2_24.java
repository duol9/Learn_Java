package week02.array;

public class W2_24 {
    public static void main(String[] args) {

        //최대값 구하기
        int[] arr = {3, 2, 1, 5, 1};

        //최대값 초기화 세팅
        int max = arr[0];

        //최대값 구하기 로직
        for (int num : arr) {
            if(num > max) {
                max = num;
            }
        }
        System.out.println("최대값은 ==> " + max);

        //최소값 구하기 로직
        int min = arr[0];
        for (int num2 : arr) {
            if (num2 < min) {
                min = num2;
            }
        }
        System.out.println("최소값은 ==> " + min);
    }
}
