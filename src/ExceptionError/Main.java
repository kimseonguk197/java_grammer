package ExceptionError;

public class Main {
    public static void main(String[] args) {

//        ArithmeticException
        int result = 10;

        System.out.println("hello1");
        try {
            if (result % 0 == 10) {
                System.out.println("result % 0");
            }
            System.out.println("helloMiddle");
//            helloMiddle이 출력되지 않음에 주목
//            db commit 상황에 주로 사용
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("hello2");


    }
}
