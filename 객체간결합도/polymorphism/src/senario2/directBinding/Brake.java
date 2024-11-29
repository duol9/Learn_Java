package senario2.directBinding;

// 브레이크
public class Brake {
    private String name;
    private boolean isInspected;

    public Brake(String name) {
        this.name = name;
        this.isInspected = false;
    }

    public boolean getIsInspected() {
        return this.isInspected;
    }

    public void setInspected(boolean inspected) {
        this.isInspected = inspected;
    }
}
