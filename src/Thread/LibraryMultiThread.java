package Thread;

public class LibraryMultiThread implements Runnable{
    static int bookCount = 100;      // 공유 자원 100권의 책

    @Override
    public void run() {
        try {
            borrowBook();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public  static void borrowBook() throws InterruptedException {
        bookCount -= 1;
        System.out.println("대출완료");
        System.out.println("남아있는 책수량 "+bookCount);
    }

}
