package Inheritance;

public class Child extends Parent {

    public int d = 30;  // public 필드
    void display() {
//        System.out.println(a); // 상속받은 private 필드 참조
        System.out.println(b);    // 상속받은 public 필드 참조
        System.out.println(c);    // 자식 클래스에서 선언한 public 필드 참조
        System.out.println(d);    // 자식 클래스에서 선언한 public 필드 참조

    }

}