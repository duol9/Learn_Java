package library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    // 1. 속성
    // 실제 세상처럼,,,, 도서관에는 책이 많음
    // books = [어린왕자] [자바의정석] [] [] [] []
    private static List<Book> books;
    // 2. 생성자(조립설명서)
    // 책을 담을 수 잇는 공간이 생성됨
    public Library() {
        books = new ArrayList<>();
    }

    // 3. 기능
    // 도서관에 책 추가
    public static void setAddBook(Book book) {
        books.add(book);
    }

    // 도서관에 책 제거
    public void removeBook(Book book) {
        books.remove(book);
    }

    // 도서관에서 책 이름으로 검색 (제어문)
    public Book searchByTitle(String title) {
        for (Book book : books) {
            String foundBookTitle = book.getTitle();
            if (foundBookTitle.equals(title)) {
                return book;
            }
        }
    }
}
