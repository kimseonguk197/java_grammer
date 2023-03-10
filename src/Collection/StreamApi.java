package Collection;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) throws IOException {


//        파일을 읽어 스트림반환
//        Stream<String> stream = Files.lines(Path.of("file.txt"));
//        stream.forEach(a-> System.out.println(a));


//        int[] arr = {10,20,20,30,40,50};
////        filter
//        int[] arr2 = Arrays.stream(arr).filter(a->a>=20).toArray();
//        System.out.println(Arrays.toString(arr2));
//
////        distinct
//        int[] arr3 = Arrays.stream(arr).distinct().toArray();
//        System.out.println(Arrays.toString(arr3));
//
//        String[] st_arr = {"HTML", "CSS", "JAVA", "JAVASCRIPT"};
//        map
////        int[] st_num = Arrays.stream(st_arr).map(a->a.length()).toArray();
////        map대신에 maptoint를 쓰면 가능
//        int[] st_num2 = Arrays.stream(st_arr).mapToInt(a->a.length()).toArray();
////        또는 이렇게 출력은 가능
//        Arrays.stream(st_arr).map(a->a.length()).forEach(a-> System.out.println(a));

//        sorted
//        int[] arr4 = Arrays.stream(arr).sorted().toArray();
//        System.out.println(Arrays.toString(arr4));
////        다만 기본적으로 stream은 stream안에서 값을 꺼내 처리하는 것이지, 다시 Array로 return하는 것이 아니므로, 제약사항이 많음.

////        reduce
//        int[] arr_reduce = {10,20,30,40};
//        int result = Arrays.stream(arr_reduce).reduce((a,b)->a+b).getAsInt();
//        System.out.println(result);
////        초기값을 전달해주면 optional객체가 아닌 값으로 Return가능
//        int result2 = Arrays.stream(arr_reduce).reduce(0,(a,b)->a+b);
//        System.out.println(result2);





//        peek() 메소드
//        peek() 메소드는 결과 스트림으로부터 요소를 소모하여 추가로 명시된 동작을 수행
//        이 메소드는 원본 스트림에서 요소를 소모하지 않으므로, 주로 연산과 연산 사이에 결과를 확인하고 싶을 때 사용
//        개발자가 디버깅 용도로 많이 사용
//        -> 실행결과를 보면 비동기적으로 실행되고, skip, limit등 각각의 함수 실행시마다 새로운 스트림이 생성되므로 각각 출력되어 출력결과 뒤죽박죽.
//        IntStream stream = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
//        stream.peek(s -> System.out.println("원본 스트림 : " + s))
////                 첫 번째 요소인 7과 두 번째 요소인 5는 skip() 메소드에 의해 삭제
//                .skip(2)
//                .peek(s -> System.out.println("skip(2) 실행 후 : " + s))
////                세 번째 요소인 5는 skip() 메소드와 limit() 메소드가 실행된 후에도 존재
//                .limit(5)
//                .peek(s -> System.out.println("limit(5) 실행 후 : " + s))
//                .sorted()
//                .peek(System.out::println)
//                .forEach(n -> System.out.println(n));



////        optional객체
//        Optional<String> opt = Optional.empty(); // Optional를 null로 초기화함.
//        System.out.println(opt.orElse("빈 Optional 객체").compareTo("abc"));
//        System.out.println(opt.orElseGet(String::new).compareTo("abc")); // String::new => ()->new String()
//        System.out.println("hello");

        String opt2 = null;
        try{
            System.out.println(opt2.compareTo("abc"));
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("hello2");



    }
}
