package SyncronizedExample;

public class BorrowThread implements Runnable{
    @Override
    public void run() {
        try {
            Library.student.borrowBook();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("학생이 빌린 총 책의 갯수 : "+Library.student.getBookCount());
    }
}