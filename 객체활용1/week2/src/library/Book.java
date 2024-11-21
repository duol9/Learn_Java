package library;

public class Book {

    // 1. 속성 (변수)
    // 제목 (title)
    private  String title;
    // 저자 (author)
    private  String author;
    // 대여여부 (isAvailable)
    private boolean isAvailable;


    // 2. 생성자 (조립설명서) -> 통해서 인스턴스화 가능
    public Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    // 3. 기능 (메서드, 함수)
    // 책 제목 조회
    public String getTitle() {
        return this.title;
    }

    // 책 대여 여부 조회
    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    // 책 대여 여부 설정
    public void setIsAvailable(boolean flag) {
        this.isAvailable = flag;
    }

    // 책 상세 정보 출력
    public void printBookInfo(){
        System.out.println("책 이름은 " + this.title + "입니다.");
        System.out.println("대여여부는 " + this.isAvailable + "입니다," );
    }
}
