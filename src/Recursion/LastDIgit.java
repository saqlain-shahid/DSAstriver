package Recursion;

public class LastDIgit {
    public static void main(String[] args) {
        System.out.println(lastDig(45456));
    }
    static int lastDig(int n){
        if (n<10){
            return n;
        }
        return lastDig(n%10);
    }
}
