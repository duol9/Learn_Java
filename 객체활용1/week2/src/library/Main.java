package library;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        Book book = new Book("자바의 정석", "XXX", true);  // 힙 메모리 영역

        Library.addBook(book);
    }
}
