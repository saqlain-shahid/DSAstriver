import java.util.Arrays;

public class SortByParity {
    public static void main(String[] args) {
        //even odd array
        int[] arr = {2,69,7,42,6,8,4,2,3};
        System.out.println(Arrays.toString(arr));
        sortByEvenOdd(arr);
//        Arrays.sort(arr);  sorting based on ascending order
        System.out.println(Arrays.toString(arr));

    }
    static void sortByEvenOdd(int[] arr){
        int n = arr.length;
        int left=0;
        int right= n-1;
        while (left<right){
            if(arr[left] % 2 == 1 && arr[right] % 2 == 0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left] % 2 == 0){
                left++;
            }
            if(arr[right] % 2 == 1){
                right--;
            }
        }
    }
    static void swap(int[] arr, int a, int b){
        int temp= arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
