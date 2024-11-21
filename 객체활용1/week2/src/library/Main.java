package library;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        Book book = new Book("자바의 정석", "XXX", true);  // 힙 메모리 영역
        // 물 주머니 = 물
        // 커피 주머니 = 커피

        // --- Book ---
        // book.titl;
        // book.author;
        // ------------

        Library.setAddBook(book);
    }
}
