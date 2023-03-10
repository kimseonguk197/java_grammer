package Generic;

public class MainClass {
    public static void main(String[] args) {
        GenericClass<Integer> gc = new GenericClass<>();
        gc.setElement(10);
        System.out.println(gc.getElement());


        Integer[] arr = {1,2,3,4,5};
        genericSwap(arr, 0, 4);
//        swap(arr, 0, 4); 이 swap메서드는 String객체는 안된다.

    }
    private static <T> void genericSwap(T[] a, int f, int r) {
        T temp;
        temp = a[f];
        a[f] = a[r];
        a[r] = temp;
    }

    private static void swap(Integer[] a, int f, int r) {
        Integer temp;
        temp = a[f];
        a[f] = a[r];
        a[r] = temp;
    }

}
