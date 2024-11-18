package week04.sample01;

public class OurClass {
    private final boolean just = true;  // 해당 just는 true이기 때문에 무조건 예외가 발생하게 되어잇음

    //throw : 던지다 (예외를 던지다, 발생시키다)
    // just가 true일 때 예외가 발생한다는 것을 '인지'

    // 이 메소드가 실행이 되면
    public void thisMethodIsDangerous () throws OurBadException { // OurBadException은 클래스를 처리하기 위한 예외 사항
        // 특정 조건을 만족할 시 (true면 예외 발생을 인지)
        if (just) {
            // 새로운 OurBadException을 만들어 가지고 던진다는 뜻
            // 던질 수 있는 이유는 thisMethodIsDangerous가 위험하다고 flag(throws OurBadException)를 달아주었기 때문
            throw new OurBadException();   // 개발자가 인지 했을 때 미리 처리할 수 있는 부분
        }
    }
}
