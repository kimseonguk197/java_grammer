package Inheritance;

public class SuperChildClass  extends SuperConstructor {

    int b;

    SuperChildClass() {
        super(10);
//        super(); 기본생성자를 호출하려면 부모클래스에 기본생성자를 만들어야 함
        b = 20;
    }
    void display() {
        System.out.println(a);
        System.out.println(b);
    }
}