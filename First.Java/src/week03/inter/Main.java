package week03.inter;

// 글래스 D 상속 받음. C라는 인터페이스를 구현함 (A,B,C 구현, D 재정의 가능)
public class Main extends D implements C {

    @Override
    public void a() {
        System.out.println("A");
    }

    @Override
    public void b() {
        System.out.println("B");
    }

    @Override
    void d() {
        super.d();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.a();
        main.b();
        main.d();
    }
}

interface A {
    void a();
}

interface B {
    void b();
}

// 인터페이스 A,B 모두 구현 가능
interface C extends A, B {
}

class D {
    void d() {
        System.out.println("D");
    }
}
