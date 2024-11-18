package week04.gen;

// 1. 제네릭 클래스 또는 메서드에 사용 가능
// <> 안에 들어가야 할 타입 명시
public class Generic<T> { // 생성된 객체 타입에 맞게 그때그때 타입이 바뀜
    // 2. 내부 필드에 String
    private T t;
    // 3. 메소드의 리턴 타입도 String
    public T get() {
        return this.t;
    }

    public void set(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        // 4.
        Generic<String> stringGeneric = new Generic<>();
        // 5.
        stringGeneric.set("Hello World");

        String tValueTurnOutWithString = stringGeneric.get();

        System.out.println(tValueTurnOutWithString);
    }
}
