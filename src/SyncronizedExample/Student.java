package SyncronizedExample;

public class Student {
    int bookCount = 5;

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

//    synchronized 를 거는것과 안거는것의 차이 확인
    public  void borrowBook() throws InterruptedException {
        int m = bookCount;
        Thread.sleep(2000);
        bookCount = m+1;
        System.out.println("대출완료");
    }

    public  void returnBook() throws InterruptedException {
        int m = bookCount;
        Thread.sleep(1000);
        bookCount = m-1;
        System.out.println("반납완료");
    }
}
