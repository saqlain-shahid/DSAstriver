package Recursion;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4};
        System.out.println(arrSum(arr,0));
    }
    static int arrSum(int[] arr, int idx){
        if (idx == arr.length) return 0;
        return arr[idx] + arrSum(arr,idx+1);
    }
}
