package week03;

// 1. 만들려고 하는 설계도를 선언 (클래스 선언)
// 2. 객체가 가지고 있어야 할 속성(필드) 정의
// 3. 객체를 생성하는 방식 정의 (생성자)          -> 어떤 input 넣어서 출력할지, 어떤 로그를 출력할지 등, 생성자명 = 클래스명
// 4. 객체가 가지고 있어야 할 행위(메서드)를 정의

// <클래스 필드>
public class Car { //1. 클래스 선언

    // 2. 속성 정의
    // <인스턴스 필드>
    // 2-(1). 고유 데이터 영역
    String company; // 자동차 회사
    String model = "Gv80"; // 자동차 모델
    String color; // 자동차 색
    double price; // 자동차 가격

    // 2-(2). 상태 데이터 영역
    double speed; // 자동차 속도, km/h
    char gear; // 기어 상태 (P, R, N, D)
    boolean lights = true; // 자동차 조명의 상태

    // 2-(3). 객체 데이터 영역
    Tire tire = new Tire();
    Door door;
    Handle handle;

    // 3. 생성자 정의
    // <생성자 영역>
    public Car () {
        // logic
        // 기본 생성자 : 생략 가능

        System.out.println("생성자 호출. 객체 생성");
    };

    // 4. 메소드 정의
    // <메소드 영역>

    // gasPedal
    // input : km/h
    // output : speed
    double gasPedal(double kmh, char type) {
        changeGear(type); // 가속도 페달을 밟으면 자동으로 기어가 변한다
        speed = kmh;
        return speed;
    }

    // brakePedal
    // input : x
    // output : speed
    double brakePedal() {
        speed = 0;
        return speed;
    }

    // changeGear
    // input : gear (char type)
    // output : gear
    char changeGear(char type) {
        gear = type;
        return gear;
    }

    // onOffLight
    // input : X
    // output : lights (boolean)
    boolean onOffLights(){
        lights = !lights;
        return lights;
    }

    // horn
    // input : x
    // output : x
    // 동작만 정의
    void horn() {
        System.out.println("빵빵");
    }

    void carSpeeds (double ... speeds) {
        for (double v : speeds){
            System.out.println("v = " + v);
        }
    }
}
