package equal;
// javadoc
/*
* 제목
* 내용 ->>>>
* */

import java.util.Objects;

public class Book extends Object {
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
        if (!(o instanceof Book book)) return false;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
