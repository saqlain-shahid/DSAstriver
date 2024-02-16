import java.util.Arrays;
import java.util.Collections;

public class ArrayQues {
    public static void main(String[] args) {
        //largest element in an array
        int[] arr = {1,5,7,3,8,9,98};
        System.out.println(largestElem(arr));
        System.out.println(secondLargest(arr));

    }
    static int largestElem(int[] arr){
        int lar = arr[0];
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
}
