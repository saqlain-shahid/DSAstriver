package Strings;

public class StudentClass {
    String name;
    private int roll_no;
    double percent;

    final String schoolName = "CCDS";

    static int numberOfStudents; //

    //default constructor
    public StudentClass(){

    }

    // parameterized constructor
    public StudentClass(String name, int roll_no, double percent){
      this.name = name;
      this.roll_no = roll_no;
      this.percent = percent;
      numberOfStudents++;
    }

    public int getRoll_no(){ //getter
        return roll_no;
    }

    public void setRoll_no(int roll){ //setter
        roll_no = roll;
    }

}
