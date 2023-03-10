package Thread;

public class Library {
    static int bookCount = 100;      // 공유 자원 100권의 책

    public static void borrowBook(){
        bookCount -= 1;
        System.out.println("대출완료");
        System.out.println("남아있는 책수량 "+bookCount);
    }
}
