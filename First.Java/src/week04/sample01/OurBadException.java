package week04.sample01;

// 예외 클래스 만들어서 예외를 정의 -> 새로운 예외 유형(OurBadException)을 만들고,
// 생서자에서 메시지를 설정해 예외가 발생했을 때의 상황 설명

// Exception을 상속 받았지만 디테일한 예외 사항은 직접 적어 주는게 좋음
public class OurBadException extends Exception {

    // 생성자
    public OurBadException () {
        // 부모생성자로 만듦 super()
        super("위험한 행동을 하면 예외처리를 꼭 해야함!!");  //예외 발생시 처리
    }
}
