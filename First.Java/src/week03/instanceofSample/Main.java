package week03.instanceofSample;

// 다형성

class Parent { } // 부모클래스
class Child extends Parent { } // 자식클래스
class Brother extends Parent { } // 자식클래스


public class Main {
    public static void main(String[] args) {

        Parent pc = new Child();  // 다형성 허용 (자식 -> 부모) / 자식클래스 생성자로 만든 부모객체

        Parent p = new Parent();

        System.out.println(p instanceof Object); // true 출력
        System.out.println(p instanceof Parent); // true 출력
        System.out.println(p instanceof Child);  // false 출력 -> child가 p의 인스턴스는 맞지만, p가 child의 인스턴스는 아님

        Parent c = new Child();

        System.out.println(c instanceof Object); // true 출력
        System.out.println(c instanceof Parent); // true 출력 ,  차일드로 만들었지만 형변환이 일어났기 때문에 맞음
        System.out.println(c instanceof Child);  // true 출력, 의도하는 클래스의 객체인지 확인. 이기 때문에 child로 만든 생성된 객체 c는 트루

    }
}
