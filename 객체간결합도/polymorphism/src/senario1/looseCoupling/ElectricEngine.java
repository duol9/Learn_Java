package senario1.looseCoupling;

// 구현체
public class ElectricEngine implements Engine{

    @Override
    public void run() {
        System.out.println("전기 엔진이 동작합니다.");
    }
}
