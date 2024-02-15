import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
//        func();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();

//       name(1,n);

//        print2(n);

//        System.out.println(sum(n));

        int fib_len = 9;

        System.out.print("Fibonacci Series of " + fib_len + " numbers is: \n");

        for (int i = 0; i < fib_len; i++) {
            System.out.print(fibo(i) + " ");
        }

    }
    static void func(){
        // infinite recursion
        System.out.println('1');
        func();
    }
    static void name(int i, int n){
        if (i>n){
            return;
        }
        System.out.println("hello");
        name(i+1,n);
    }
    static void print(int n) {
        //1toN
        if (n<=0){
            return ;
        }
        print(n-1);
        System.out.println(n);
    }

    static void print2(int n) {
        //N to 1
        if (n<=0){
            return ;
        }
        System.out.println(n);
        print2(n-1);

    }
    static int sum(int n){
        if (n==0){
            return n;
        }
        return n+sum(n-1);

    }
    static int fibo(int n){

        if (n==0){
            return 0;
        }
        if (n==1 || n==2){
            return 1;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
