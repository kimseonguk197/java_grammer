package Collection;

import AbstractClass.Cat;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaMain {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "World";

        NonLambdaImpl nonLambdaImple = new NonLambdaImpl();
        nonLambdaImple.makeString("Hello","World");

//        구현클래스 없이 -> 익명클래스
//        익명클래스 없이 -> 익명함수만 가지고 -> 메서드를 담은 참조변수만을 가지고
//        장점 : 불필요한 객체를 만들지 않아도 됨
        LambdaInterface makeSt = (s, v) -> System.out.println(s + "," + v);
        makeSt.makeString(s1, s2);


//        comparator예제 다시 한번 확인

////        new thread예제
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("전통적인 방식의 일회용 스레드 생성");
//            }
//        });
//        t1.start();
//
//        Thread t2 = new Thread(() -> System.out.println("람다 표현식을 사용한 일회용 스레드 생성"));
//        t2.start();
//
//        new Thread(() -> {}).start();


////        데이터와 객체 중심이 아닌, 입력에 따른 출력만이 존재하는 함수형 패러다임
//        int[] arr = {20,10,5,12};
//        Arrays.sort(arr);
//        for(int a : arr) System.out.println(a);
//
//        Arrays.stream(arr).sorted().forEach(a-> System.out.println(a));
//        for(int a : arr) System.out.println(a);

        List<TestObject> lst = new ArrayList<>();
        lst.add(new TestObject("lee",20));
        lst.add(new TestObject("kim",19));
        lst.add(new TestObject("park",15));
        lst.add(new TestObject("choi",22));

//        Collections.sort(lst, (a,b)-> a.getAge()-b.getAge());
//        for(TestObject to : lst){
//            System.out.println(to.getName());
//            System.out.println(to.getAge());
//        }

//        List<TestObject> lst2 = lst.stream()
//                .sorted(Comparator.comparing(a->a.getAge())).collect(Collectors.toList());
//
//        for(TestObject to : lst2){
//            System.out.println(to.getName());
//            System.out.println(to.getAge());
//        }
//        lst.stream()
//                .sorted(Comparator.comparing(a->a.getAge())).forEach(a-> {
//                    System.out.println(a.getName());
//                    System.out.println(a.getAge());
//                });



    }
}
