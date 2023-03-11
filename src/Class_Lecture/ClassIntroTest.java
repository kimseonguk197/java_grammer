package Class_Lecture;

import AbstractClass.Animal;

public class ClassIntroTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//        클래스에서 매서드를 가져와 사용
        int c = ClassInstanceDifference1.sum(a, b);
        System.out.println(c);

//        객체를 만들지 않고, 클래스를 계속 사용했을때의 문제점
        int totalA = ClassInstanceDifference1.static_sum_acc(a);
        System.out.println(totalA);
        int totalB = ClassInstanceDifference1.static_sum_acc(a);
        System.out.println(totalB);

        ClassInstanceDifference1 ci = new ClassInstanceDifference1();
        ci.sum_acc(10);
        int total = ci.sum_acc(20);
        System.out.println(total);
        System.out.println(ci.instanc_total);

        ClassInstanceDifference2 cd = new ClassInstanceDifference2();
        cd.name = "abc";
        cd.age = 20;
        ClassInstanceDifference2.static_name = "abc2";
        ClassInstanceDifference2.static_age = 30;



////        Animal Class
//        InstanceExample cat = new InstanceExample();
//        System.out.println(cat.getName());
//        cat.setName("boby");  // 메소드 호출
//        System.out.println(cat.getName());


    }

//    void return_test(String nick){
//        if ("fool".equals(nick)) {
//            return;
//        }
//        System.out.println("나의 별명은 "+nick+" 입니다.");
//    }

}
