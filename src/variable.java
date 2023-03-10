import java.math.BigDecimal;

public class variable {
    public static void main(String[] args) {

//        변수란
//        int num;
//        num = 20;                // 변수의 초기화
//        System.out.println(num); // 20

//        정수
//        byte로 썼을때, 언더플로우,오버플로우 나는것과 int형을 선언한것과의 비교
//        byte num1 = 127;
//        byte num2 = -128;
//
//        num1++; // 127 + 1
//        num2--; // -128 - 1
//
//        System.out.println(num1); // -128
//        System.out.println(num2); // 127

//        실수
//        float num3 = 1.23456789f;
//        double num4 = 1.23456789;
//        System.out.println("float형  변수 num3 : " + num3);
//        System.out.println("double형 변수 num4 : " + num4);
//        그러나 double형도 15자 이상이 넘어가면 제대로 표현하지 못하는 문제 발생

//        부동소수점
//        double num = 0;
//        for(int i = 1; i <= 1000; i++) {
//            num += 0.1;
//        }
//        System.out.println(num);
//
////        BigDecimal
//        double num1 = 1.03;
//        double num2 = 0.42;
//        System.out.println(num1-num2);
//        BigDecimal a = new BigDecimal("1.03");
//        BigDecimal b = new BigDecimal("0.42");
//        System.out.println(a.subtract(b));
////        BigDecimal대신 계산법
//        System.out.println(0.1 + 0.2);
//        System.out.println((0.1 * 10 + 0.2 * 10) / 10);
//
////        문자형의 숫자출력
//        char chr = 'a';
//        int num1 = chr;
//        int num2 = (int)chr;
//        System.out.println(num1);
//        System.out.println(num2);
//
////        논리형 타입
//        boolean trueOrFalse = true;
//        System.out.println(trueOrFalse);
//        if(trueOrFalse){
//            System.out.println("참입니다.");
//        }
//        int num1 =10;
//        int num2 =20;
//        if(num1>num2){
//            System.out.println("참입니다.");
//        }
//
////        상수
//        final int AGES = 100;
//        AGES = 200;
//        System.out.println(AGES);
//
////        묵시적 타입변환
////        double에 int를 넣는 것은 가능
//        double num1 = 10;
////        int에 double을 넣는것은 불가능
//          int num2 = 3.14;
////        double에 float와 double을 연산한 값을 넣는 것은 가능
//        double num3 = 7.0f + 3.14;
//        System.out.println(num1);
//        System.out.println(num3);
//
////        명시적타입변환
//        int num1 = 1, num2 = 4;
//        double result1 = num1 / num2;
////        이렇게 피연산자 중 하나의 타입이 double형이 되면, 나눗셈 연산을 위해 나머지 하나의 피연산자도 double형으로 자동 타입 변환
//        double result2 = (double) num1 / num2;
//        System.out.println(result1);
//        System.out.println(result2);

    }
}
