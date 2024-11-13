package week03.extendsExample;

public class SportsCar extends Car{
    // engine과 booster() 을 추가해 확장시킴
    String engine;
    public void booster() {
        System.out.println("엔진 " + engine + " 부앙~\n");
    }
}
