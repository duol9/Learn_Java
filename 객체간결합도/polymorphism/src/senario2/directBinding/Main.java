package senario2.directBinding;

import senario2.looseCoupling.Sensor;

public class Main {
    public static void main(String[] args) {
        Brake brake = new Brake("디스크 브레이크");
        InspectService inspectService = new InspectService();
        inspectService.inspect(brake);

    }
}
