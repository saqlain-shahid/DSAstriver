package BasicQues;

public class P9 {
    public static void main(String[] args) {
        int a = 11110;
        int b = 100;
        int c = 1200;

        if (a>=b && a>=c) System.out.println("Largest: A = " + a);
        else if (b>=a && b>=c) System.out.println("Largest: B = " + b);
        else System.out.println("Largest: C = " + c);
    }
}
