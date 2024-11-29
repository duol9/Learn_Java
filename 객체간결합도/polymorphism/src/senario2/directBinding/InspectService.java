package senario2.directBinding;

// 검수하는 클래스
public class InspectService {
    // 브레이크 외부로부터 주입받아서 검수
    public void inspect(Brake brake) {
        System.out.println("검수를 시작합니다.");
        System.out.println(brake.getIsInspected());
        brake.setInspected(true);
        System.out.println("변경되었습니다 -> " + brake.getIsInspected());
    }
}
