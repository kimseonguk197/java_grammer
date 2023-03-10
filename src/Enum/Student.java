package Enum;

public class Student{
    private String name;
    private EnumClass class_name;
    public void setName(String name){
        this.name = name;
    }
    public void setClass_name(EnumClass class_name){
        this.class_name = class_name;
    }
    public String getName(){
        return this.name;
    }
    public static void main(String[] args) {

        Student st = new Student();
        st.setName("kim");
        st.setClass_name(EnumClass.FIRST_GRADE);
//        st.setClass_name("first_class");
        System.out.println(st.getName());
        System.out.println(st.getClass());


        System.out.println(EnumClass.FIRST_GRADE);
        System.out.println(EnumClass.FIRST_GRADE.name());
        System.out.println(General.a1);


    }
}
