package week04.sample01;

//checked Exception 다뤄보기
public class StudyException {
    public static void main(String[] args) {

        // 인스턴스 화
        OurClass ourClass = new OurClass();
       /*
        ourClass.thisMethodIsDangerous();  // 위험한데도 불구하고 그냥 호출 중임. 이거 안됨
                                            // -> 자바에서 제공하는 예외처리 메소드로 감싸줘야 함

       */

        // 예외처리 메소드 try - catch ~ finally
        //일단 try해. 그리고 예외가 발생하면 catch 해.
        //정상적 수행이든, 예외가 발생하든 결국 마침내(finally) 수행해야 하는 로직을 수행해
        try {
            ourClass.thisMethodIsDangerous();  // 일단 실행
        } catch (OurBadException e) {
            // 에러메시지 출력
            System.out.println(e.getMessage()); //여기선 생성자 구현 시 작성했던 print문이 출력됨
        } finally {  // finally는 꼭 없어도 됨. 하지만 finally을 사용하면 무조건 거쳐야 하는 곳
            System.out.println("우리는 방금 예외를 handling 했습니다. 정상처리되든, 예외처리되든 여기를 거칩니다. ");

        }
    }
}
