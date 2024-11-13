package week03.interSample;

public class Main {
    public static void main(String[] args) {

        // 자동 형변환
        // A 인터페이스에 구현체 B 대입
        A a1 = new B();
        a1.a();  // 인터페이스 A에 접근 후 a메소드를 호출함. 생성자 B에서 구현된 a를 호출함
        // a1.b(); // 불가능 -> a1은 인터페이스 A 타입이기 대문에, a() 메서드만 가지고 있음

        System.out.println("\nB 강제 타입변환");
        B b = (B) a1;
        b.a();
        b.b(); // 강제 타입변환으로 사용 가능
        System.out.println();

        // A 인터페이스에 구편체 B를 상속받은 C 대입
        A a2 = new C();
        a2.a();
        //a2.b(); // 불가능   -> 클래스 C로 생성하기는 했지만, 형변환으로 인해 타입은 a이기 때문에 관련된 것만 사용할 수 있음.
        //a2.c(); // 불가능

        System.out.println("\nC 강제 타입변환");
        C c = (C) a2;
        c.a();
        c.b(); // 강제 타입변환으로 사용 가능
        c.c(); // 강제 타입변환으로 사용 가능


    }
}

interface A {
    void a();
}
class B implements A {
    @Override
    public void a() {
        System.out.println("B.a()");
    }

    public void b() {
        System.out.println("B.b()");
    }
}
class C extends B {
    public void c() {
        System.out.println("C.c()");
    }
}
