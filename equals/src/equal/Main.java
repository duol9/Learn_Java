package equal;

public class Main {
    public static void main(String[] args) {
        System.out.println("프로그램의 시작점");
        
        int a = 1;
        int b = 1;
        int c = 2;

        Book bookA = new Book("소년이 온다", "한강");
        Book bookB = new Book("소년이 온다", "한강");
        Book bookC = new Book("소년이 온다", "한강");
        
        boolean ret = (bookA.equals(bookB));
        System.out.println("ret = " + ret);

/*        boolean ret = (bookA == bookB);
        System.out.println("ret = " + ret);
        
        boolean ret2 = (a == b);
        System.out.println("ret2 = " + ret2);*/

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(bookB);
        System.out.println(bookA);
        System.out.println(bookC);
    }
}
