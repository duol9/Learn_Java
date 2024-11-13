package week03.poly;

public class Main {
    public static void main(String[] args) {

        //강제형변황 자식클래스가 부모 클래스로 강제 형변환됨
        Tire kiaSampleTire = new KiaTire("KIA");
        Tire hankookSampleTire = new HankookTire("Hankook");

        // 매개변수 다형성 확인!
        Car car1 = new Car(new KiaTire("KIA"));  //기아타이어 객체가 카 클래스 객체가 됨
        Car car2 = new Car(new HankookTire("HANKOOK")); //한국타이어 객체가 카 클래스 객체가 됨

        // 반환타입 다형성 확인!
        Tire hankookTire = car1.getHankookTire();
        KiaTire kiaTire = (KiaTire) car2.getKiaTire();

        // 오버라이딩된 메서드 호출
        car1.tire.rideComfort(); // KIA 타이어 승차감은 60
        car2.tire.rideComfort(); // HANKOOK 타이어 승차감은 100
    }
}
