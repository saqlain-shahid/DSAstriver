package Recursion;

public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {3,10,3,2,51};
        System.out.println( maxArr(arr,0));
    }
    static int maxArr(int[] arr, int idx){
        //base case
        if (idx==arr.length-1) return arr[idx];

        int smallAns = maxArr(arr,idx+1);

        return Math.max(arr[idx],smallAns);
    }
}
