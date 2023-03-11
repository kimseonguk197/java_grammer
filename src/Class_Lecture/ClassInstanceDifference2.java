package Class_Lecture;

public class ClassInstanceDifference2 {
    static  String static_name;
    static String static_email;
    static String static_password;
    static int static_age;
    static String static_gender;

    String name;
    String email;
    String password;
    int age;
    String gender;

    public void whoIs(String name, int age, String gender, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
        this.gender = gender;
    }


    public static void static_whoIs(String name, int age, String gender, String email, String password){
        static_name = name;
        static_email = email;
        static_password = password;
        static_age = age;
        static_gender = gender;
    }


}
