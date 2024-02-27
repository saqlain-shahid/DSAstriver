package Loops;

public class ReverseANum {
    public static void main(String[] args) {
        int revNo=0;
        int n = 1234;
        while(n!=0){
            int last = n%10;
            n/=10;
            revNo = (revNo*10) + last;
        }
        System.out.println(revNo);
    }
}
