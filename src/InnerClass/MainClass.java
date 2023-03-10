package InnerClass;

import AbstractClass.Animal;

import java.util.Comparator;

public class MainClass {
    public static void main(String[] args) {

        AnimalOuter a1 = new AnimalOuter();
        AnimalOuter.Cat a1Cat= a1.new Cat();
        a1Cat.cry();
        AnimalOuter.Dog a1Dog= a1.new Dog();
        a1Dog.cry();

        Anonymous an1 = new Anonymous();
        System.out.println(an1.getNum());
        System.out.println(an1.getClass());

        Anonymous an2 = new Anonymous(){
            public int num = 10;
            @Override
            public int getNum(){
                return this.num;
            }
        };
        System.out.println(an2.getNum());
        System.out.println(an2.getClass());

//       인터페이스의 익명객체화를 통한 방법
        AnimalInterface ai = new AnimalInterface() {
            @Override
            public void cry() {
                System.out.println("cry cry");
            }
        };
        ai.cry();

//       인터페이스의 람다함수화를 통한 방법
        AnimalInterface ai2 = ()-> System.out.println("cry cry lambda");
        ai2.cry();


    }
}
