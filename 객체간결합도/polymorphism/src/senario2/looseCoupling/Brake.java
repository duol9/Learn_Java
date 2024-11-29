package senario2.looseCoupling;

public class Brake extends CartPart{
    private String name;

    public Brake(String name) {
        super(false);
        this.name = name;
    }

    public void stop() {
        System.out.println("멈출 수 있다.");
    }
}
