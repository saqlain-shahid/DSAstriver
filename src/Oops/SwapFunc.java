package Oops;

public class SwapFunc {
    public static void main(String[] args) {

       int a = 8;
       int b = 9;
       swap(a,b); //pass by value so it wont work
       System.out.print(a + " "+ b);
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

    }
}
