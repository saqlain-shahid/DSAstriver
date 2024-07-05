package BasicQues;

public class P6 {
    public static void main(String[] args) {
        int a = 9;
        int b = 2;
        System.out.println("Before swapping " + a + " " + b);
        //bitwise XOR
        a = a^b;  //a = a+b;
        b = a^b;  //b = a-b;
        a = a^b;  //a = a-b;
        System.out.println("After swapping " + a + " " + b);
    }
}
