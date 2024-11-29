package senario1.directBinding;

/**
 * 1. GasEngine 생성
 * 2. 자동차 수행
 */
public class Car {

    //속성
    private GasEngine gasEngine;
    private ElectricEngine electricEngine = new ElectricEngine();

    //생성자
    public Car() {
        this.gasEngine = new GasEngine();
    }

    public void drive() {
        System.out.println("자동차가 주행됩니다.");
        this.gasEngine.run();
    }

    public void driveWithElectricEngine() {
        System.out.println("주행을 시작합니다.");
        this.electricEngine.run();
    }
}
