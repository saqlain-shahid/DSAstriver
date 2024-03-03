package Recursion;

public class LSrecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        System.out.println(linearSearch(arr,9,0));
    }
    static boolean linearSearch(int[] arr, int target, int idx){
        //base case
        if (idx >= arr.length) return false;
        //self work
        if (target == arr[idx]) return true;
        // recursive work
        return linearSearch(arr, target, idx + 1);
    }
}
