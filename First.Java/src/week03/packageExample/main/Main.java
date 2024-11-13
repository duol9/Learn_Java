package week03.packageExample.main;

import week03.packageExample.pk2.Car;

public class Main {
    public static void main(String[] args) {

        // pk1과 pk2 패키지를 동시에 쓸 수 없음
        // 동시에 쓰려면
        // week03.packageExample.pk2.Car car2 = new week03.packageExample.pk2.Car();
        // 이처럼 import해야함.
        Car car = new Car();
        car.horn();
    }
}
