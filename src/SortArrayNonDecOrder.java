import java.util.Arrays;
import java.util.Collections;

public class SortArrayNonDecOrder {
    //code need some changess   ...
    public static void main(String[] args) {
        int[] arr = {-8,-2,5,4,5,-12};
       int ans[] = sort(arr);
       System.out.println( Arrays.toString(ans));
    }
    static int[] sort(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int k =0;
        int[] ans = new int[n];

        while(left<=right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            }
            else{
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        reverse(ans);
        return ans;
    }
    static void reverse(int[] arr){
        int i =0, j=arr.length-1;
        while (i<j){
            swap(arr,i,j);
            i++;
            j--;
        }

    }
    static void swap(int[] arr, int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

}
