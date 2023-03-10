package Thread;

import SyncronizedExample.ReturnThread;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
//        Thread th = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("thread first "+Thread.currentThread().getName());
//            }
//        });
//        th.start();
//        new Thread(()-> System.out.println("thread second "+Thread.currentThread().getName())).start();
//        new Thread(()-> System.out.println("thread third "+Thread.currentThread().getName())).start();
//
//        Thread rt = new Thread(new RunnableThread());
//        rt.start();



//        일반호출
//        for(int i=0; i<100; i++){
//            Library.borrowBook();
//        }

////        도서관 대출호출
//        Thread t1 = new Thread(new LibraryMultiThread());
//        t1.start();

        for(int i=0; i<100; i++){
            new Thread(new LibraryMultiThread()).start();
        }
        Thread.sleep(3000);
        System.out.println("최종 수량은 ? " + LibraryMultiThread.bookCount);
//        while(true){
//            if(LibraryMultiThread.bookCount==0){
//                System.out.println("최종 카운트 : "+LibraryMultiThread.bookCount);
//                break;
//            }
//        }
    }
}
