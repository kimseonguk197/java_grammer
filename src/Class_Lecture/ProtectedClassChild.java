package Class_Lecture;
import Inheritance.ProtectedClass;

public class ProtectedClassChild extends ProtectedClass {
    public static void main(String[] args) {

//        상속받은 객체를 생성해서 사용해야 한다는 점 유의 (직접 ProtectedClass를 호출하는 것은 당연히 안될것)
        ProtectedClassChild sp = new ProtectedClassChild();
        System.out.println(sp.sameVar); // 다른 패키지에 속하는 자식 클래스까지 허용

    }
}