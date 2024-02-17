import java.util.Arrays;
import java.util.Collections;

public class ArrayQues {
    public static void main(String[] args) {
        //largest element in an array
        int[] arr = {1,5,7,3,3,8,9,98,99};
        int[] arr2 = {1,2,3,3,4,4,4,5,6};
//        System.out.println(largestElem(arr));
//        System.out.println(secondLargest(arr));
//        System.out.println(isSorted(arr2));
//        System.out.println(removeDups(arr2));
         int[] ans=LeftRotateArray(arr2);
        System.out.println(Arrays.toString(ans));

    }
    static int largestElem(int[] arr){
        int lar = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>lar){
                lar = arr[i];
            }
        }
        return lar;
    }


    static int secondLargest(int[] arr){
       int high = Integer.MIN_VALUE;
       int secHigh = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > high){
                secHigh = high;
                high = arr[i];
            }
            if (arr[i] < high && arr[i] > secHigh){
                secHigh = arr[i];
            }
        }
        return secHigh;
    }
    static boolean isSorted(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i-1]){

            }
            else {
                return false;
            }
        }
        return true;
    }
    static int removeDups(int[] arr){
        int i=0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }

    static int[] LeftRotateArray(int[] arr){
        int temp=arr[0];
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1]=temp;
        return arr;
    }
}
