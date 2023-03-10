package SyncronizedExample;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("현재 대출한 책의 갯수 : "+Library.student.getBookCount());
        Thread bt = new Thread(new BorrowThread());
        Thread rt = new Thread(new ReturnThread());

        bt.start();
        rt.start();

        try{
//            join : Waits for this thread to die
            bt.join();
            rt.join();
//            join을 해주지 않으면, 쓰레드 종료를 기다리지 않고, 아래 내용 수행
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("안녕히 계세요");
    }
}