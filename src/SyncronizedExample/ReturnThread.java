package SyncronizedExample;

public class ReturnThread implements Runnable{
    @Override
    public void run() {
        try {
            Library.student.returnBook();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("학생이 빌린 총 책의 갯수 : "+Library.student.getBookCount());
    }
}