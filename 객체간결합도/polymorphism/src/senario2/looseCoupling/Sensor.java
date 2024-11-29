package senario2.looseCoupling;

public class Sensor extends CartPart{

    private String name;

    public Sensor(String name) {
        super(false);
        this.name = name;
    }
}
