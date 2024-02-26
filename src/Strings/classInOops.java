package Strings;

public class classInOops {


    public static void main(String[] args) {
//        StudentClass s = new StudentClass(); //declaration
//        s.name = "saqlain";
////        s.roll_no = 69;
//        s.percent = 88.63;
//        s.getRoll_no(); //getter
//        s.setRoll_no(87); //setter
//        System.out.println(s.getRoll_no());
        StudentClass s1 = new StudentClass("saqlain",54,45.8); // constructor call
        System.out.println(s1.name);
        System.out.println(s1.getRoll_no());
        System.out.println(s1.percent);
        System.out.println(s1.schoolName);

        StudentClass s2 = new StudentClass("yusra",69,98.6);
        System.out.println(s2.name);


    }
}
