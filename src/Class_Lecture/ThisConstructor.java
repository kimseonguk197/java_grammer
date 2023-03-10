package Class_Lecture;

public class ThisConstructor {

    String year;
    String month;
    String day;

    public ThisConstructor(String year) {
        this(year, null, null);
//        아래와 같이 코드를 중복시키지 않고, this()활용
//        this.year = year;
    }

    public ThisConstructor(String year, String month) {
        this(year, month, null);
//        아래와 같이 코드를 중복시키지 않고, this()활용
//        this.year = year;
//        this.month = month;

    }

    public ThisConstructor(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static void main(String[] args) {
        ThisConstructor im1 = new ThisConstructor("2017년");
        System.out.println(im1.year);
        ThisConstructor im2 = new ThisConstructor("2017년", "3월");
        System.out.println(im2.year + im2.month);
        ThisConstructor im3 = new ThisConstructor("2017년", "3월", "13일");
        System.out.println(im3.year + im3.month + im3.day);
    }
}
