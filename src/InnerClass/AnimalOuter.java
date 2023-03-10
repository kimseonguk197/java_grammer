package InnerClass;

public class AnimalOuter { // 외부 클래스
    class Cat { // 내부 클래스
        void cry(){
            System.out.println("야옹");
        }
    }
    class Dog { // 내부 클래스
        void cry(){
            System.out.println("멍멍");
        }
    }
}
