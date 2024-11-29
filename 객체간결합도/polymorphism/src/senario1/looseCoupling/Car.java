package senario1.looseCoupling;

/**
 * 1. 어떤 엔진이 들어올 지 모르지만 engine이라면 무엇이든 받을 준비가 되어잇음
 * 2. 외부에서 넘겨줄 때 engine의 종류가 결정됨
 */
public class Car {

    //속성
    // 구현체가 아닌 인터페이스를 가지고 있음
    private Engine engine;

    //생성자
    public Car(Engine engine) {
        this.engine = engine;
    }

    //기능
    public void drive() {
        this.engine.run();
    }
}
