package equal;
// javadoc
/*
* 제목
* 내용 ->>>>
* */

import java.util.Objects;

public class Book {
    //1. 속성
    private String title;
    private String author;

    /**
     *
     * @param title : 제목
     * @param author : 작가
     */

    //2. 생성자
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * 게터
     * 책 제목을 리턴합니다.
     * @return
     */

    //3. 기능
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(title);
        result = 31 * result + Objects.hashCode(author);
        return result;
    }

    /*@Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;  // obj를 book으로 형변환
        if (this.title == book.getTitle() && this.author == book.getAuthor()) {
            return true;
        } else {
            return false;
        }
    }*/
}
