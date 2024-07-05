package Arrays;

import java.util.Scanner;

public class GreaterThanItself {
    public static void main(String[] args) {
        //atleast 1 element greter than itself
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i]==max){
                cnt++;
            }
        }
        System.out.println("remaining elements " + (n-cnt));

        

    }

}
