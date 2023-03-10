package Class_Lecture;

import AbstractClass.Animal;

import java.lang.reflect.Constructor;

public class ClassIntroTest {
    public static void main(String[] args) {
        int a= 10;
        int b= 20;

//        클래스에서 매서드를 가져와 사용
        int c = ClassIntro.sum(a,b);
        System.out.println(c);

//        객체를 만들지 않고, 클래스를 계속 사용했을때의 문제점
        int totalA = ClassIntro.static_sum_acc(a);
        System.out.println(totalA);
        int totalB = ClassIntro.static_sum_acc(a);
        System.out.println(totalB);

        ClassIntro ci = new ClassIntro();
        ci.sum_acc(10);
        int total = ci.sum_acc(20);
        System.out.println(total);
        System.out.println(ci.instanc_total);


//        Animal Class
        Animal cat = new Animal();
        System.out.println(cat.name);
        cat.setName("boby");  // 메소드 호출
        System.out.println(cat.name);

//        void에서 return을 통해 빠져나가기
        ClassIntroTest sample = new ClassIntroTest();
        sample.return_test("angel");
        sample.return_test("fool");  // 출력되지 않는다.

//        메소드 내에서 선언된 변수의 효력 범위
        int num = 10;
        sample.range_method(num);
        System.out.println(num);


    }

    void return_test(String nick){
        if ("fool".equals(nick)) {
            return;
        }
        System.out.println("나의 별명은 "+nick+" 입니다.");
    }

    int range_method(int num){
        num += 10;
        return num;
    }
}
