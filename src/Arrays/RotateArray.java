package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Arrays input: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("k rotations: ");
        int k = sc.nextInt();
        k=k%n;
        rev(arr,0, arr.length-1);
        rev(arr,k,k-1);
        rev(arr,k, arr.length-1);
        System.out.println(Arrays.toString(arr));




    }
    static void rev(int[] arr, int s, int e){
        int sp = s;
        int ep = e;
        while (sp<ep){
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }
    }
}
