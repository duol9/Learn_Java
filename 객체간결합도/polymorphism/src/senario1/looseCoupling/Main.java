package senario1.looseCoupling;

//느슨한 결합
public class Main {
    public static void main(String[] args) {
        GasEngine gasEngine = new GasEngine();
        ElectricEngine electricEngine = new ElectricEngine();

        Car gasCar = new Car(gasEngine);
        gasCar.drive();
    }
}
