//public class Operator {
//    public static void main(String[] args) {
////        산술연산자
////        int num1 = 8, num2 = 3;
////        System.out.println("+ 연산자에 의한 결과 : "+ (num1 + num2));
////        System.out.println("- 연산자에 의한 결과 : "+ (num1 - num2));
////        System.out.println("* 연산자에 의한 결과 : "+ (num1 * num2));
////        System.out.println("/ 연산자에 의한 결과 : "+ (num1 / num2));
////        System.out.println("% 연산자에 의한 결과 : "+ (num1 % num2));
//
////        대입연산자
////        int num1 = 7, num2 = 7, num3 = 7;
////        num1 = num1 - 3;
////        num2 -= 3;
////        num3 =- 3;
////        System.out.println("- 연산자에 의한 결과 : "+ num1);
////        System.out.println("-= 연산자에 의한 결과 : "+ num2);
////        System.out.println("=- 연산자에 의한 결과 : "+ num3);
//
////        비교연산자
////        char ch1 = 'a', ch2 = 'A';;
////        System.out.println("== 연산자에 의한 결과 : "+ (ch1 == ch2));
////        System.out.println("> 연산자에 의한 결과 : "+ (ch1 > ch2));
//
////        논리연산자
////        int num1 = 10, num2= 20;
////        boolean result1, result2;
////        result1 = (num1 > 5) && (num1 < 20) ;
////        result2 = (num2 < 10) || (num2 < 30) ;
////        System.out.println("&& 연산자에 의한 결과 : "+ result1);
////        System.out.println("|| 연산자에 의한 결과 : "+ result2);
////        System.out.println("! 연산자에 의한 결과 : "+ !result2);
//
//////        비트연산
//////        &, AND 연산
////        num1==0001001, num2==0001010
////        int num1=5; int num2=6;
////        System.out.println(num1&num2);
//////       |, OR연산
////        System.out.println(num1|num2);
//////       ^, XOR연산
////        System.out.println(num1^num2);
//
//////        <<시프트연산자
////        System.out.println(num1<<1);
//////        >>시프트연산자
////        System.out.println(num2<<1);
//
////       AND와 XOR을 활용한 덧셈
//        System.out.println(addWithoutPlus(7,6));
//
////        삼항연산자
//        int minute = 10;
//        String result;
//        result = (minute >= 10) ? Integer.toString(minute) : '0'+Integer.toString(minute);
//        System.out.println("현재 시각중 분은 " + result +"입니다.");
//
//    }
//
////    AND와 XOR을 활용한 덧셈
//    static int addWithoutPlus(int a, int b){
//        if(b==0){
//            System.out.println("b==0");
//            return a;
//        }else if(a==0){
//            System.out.println("a==0");
//            return b;
//        }
//        int sum=a^b;
//        int carry=(a&b)<<1;
//        System.out.println("sum : " + sum + " carry : "+carry);
//        return addWithoutPlus(sum, carry);
//    }
//}
