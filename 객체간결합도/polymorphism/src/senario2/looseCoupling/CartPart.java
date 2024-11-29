package senario2.looseCoupling;

public abstract class CartPart {
    private boolean isInspected;

    public CartPart(boolean isInspected){
        this.isInspected = isInspected;
    }

    public void inspect() {
        System.out.printf("검사를 진행합니다. " + isInspected);
        this.isInspected = true;
        System.out.println(" -> " + this.isInspected);
    }
}
