public class Cup {
    // 1. 속성
    // private를 기본으로 해두자.
    private String name;
    private String color;

    // 2. 생성자
    public Cup() {

    }

    // 3. 기능
    public void methodA() {

    }


    // private을 사용하는 속성들 중 필요한 데이터만 외부로 노출하기 위해
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
