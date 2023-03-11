package Class_Lecture;


public class ClassInstanceDifference1 {
//    클래스 변수
    static int total=0;
//    객체변수
    int instanc_total=0;

    public static int sum(int a, int b){
        return a+b;
    }

//    클래스 함수
    public static int static_sum_acc(int a){
        total += a;
        return total;
    }
    public int sum_acc(int a){
        this.instanc_total += a;
        return this.instanc_total;
    }
}
