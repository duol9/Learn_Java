public class Robot {

    // 1. 속성
    private boolean leftLeg;
    private boolean rightLeg;
    private boolean one;
    private boolean two;

    // 3. 기능
    public void moveRobpt(boolean power){
        this.leftLeg = power;
        this.rightLeg = power;
    }
}
