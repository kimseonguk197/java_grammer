//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class OtherVariables {
//    public static void main(String[] args) {
//
//////        리터럴과 new String 방식의 차이
////        String st1 = "hello";
////        String st2 = "hello";
////        String st3= new String("hello");
////        String st4= new String("hello");
////
////        System.out.println(st1);
////        System.out.println(st3);
////
//////        출력의 결과는 동일하나 == 로 비교해보았을때 차이 발생
//////        st1 == st2, st1==st3, st3==st4 각각비교
////        System.out.println(st3==st4);
//
//////        indexOf
////        String a = "Hello Java";
////        System.out.println(a.indexOf("Java"));  // 6 출력
//
////        contains
////        String a = "Hello Java";
////        System.out.println(a.contains("Java"));  // true 출력
//
//////        charAt()
////        String st = "abcdefabaadf";
//////        반복문을 사용해 해당 문자열 안에 a가 몇개 들었는지 count
////
//////        replaceAll
////        String a = "Hello Java";
////        System.out.println(a.replaceAll("Java", "World"));  // Hello World 출력
//////        replaceAll과 메타문자열을 활용한 숫자치환
////        String str = "01abc123한글1234";
////        String restr = str.replaceAll("[^0-9]",""); //011231234
////        System.out.println(str + " ==> " + restr);
//
//////      Pattern클래스의 matches()메소드를 활용하여 대상 문자열을 검증할 수 있음. Matcher도 사용하니, 필요하면 검색.
//////        숫자만 있는지 검증하고 싶을땐, "[0-9]*"  을 사용. *는
//////        email형식의 경우 : ^[a-zA-Z0-9+-_.]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$
////        boolean matcher = Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$", "010-4011-2809");
////        if(matcher){
////            System.out.println("적합한 전화번호 형식입니다.");
////        }else{
////            System.out.println("다시 입력해주세요");
////        }
//
//////        substring(a,b) : a부터 b미만까지임에 유의
////        String st = "hello world";
////        System.out.println(st.substring(0,5));
//
//////        split 기본
////        String a = "a:b:c:d";
////        String[] result = a.split(":");  // result는 {"a", "b", "c", "d"}
//////        split 활용
////        String str = "1aA2bB3cC";
////        String[] results = str.split("[0-9]");
////        System.out.println(Arrays.toString(results));
//
//////        trim과 strip
////        String st = "   hello  ";
////        System.out.println(st.trim());
////        System.out.println(st.strip());
////        Scanner sc = new Scanner(System.in);
////        String input = sc.nextLine();
////        System.out.println(input);
////        System.out.println(input.strip());
//
//////        String -> int
////        String st = "123";
////        int st_n = Integer.parseInt(st);
////        if (st_n == (int)st_n)
////        {
////            System.out.println("정수입니다.");
////        }
//
//////        int -> String
////        int input = 10;
////        String st_int1 = Integer.toString(input);
////        String st_int2 = String.valueOf(input);
////        System.out.println(st_int1.getClass().getName());
//
//
//////      StringBuffer사용과 String의 +=와의 비교
////        StringBuffer sb = new StringBuffer();  // StringBuffer 객체 sb 생성
////        sb.append("hello");
////        sb.append(" ");
////        sb.append("jump to java");
////        String result = sb.toString();
////        System.out.println(result);
//
//////      Stringbuffer와 String 비교 : 문자열 += 을 통한 재선언과정
////        String result = "";
////        result += "hello";
////        result += " ";
////        result += "jump to java";
////        System.out.println(result);
//
//
//////        StringBuffer insert
////        StringBuffer sb = new StringBuffer();
////        sb.append("jump to java");
////        sb.insert(5, "hello ");
////        System.out.println(sb);
//    }
//}
