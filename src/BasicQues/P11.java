package BasicQues;

public class P11 {
    public static void main(String[] args) {
        int n= 2025;
        if((n%4==0 && n%100!=0) || n%400==0) System.out.println("leap");
        else System.out.println("not leap");
    }
}
