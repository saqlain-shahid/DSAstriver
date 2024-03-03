package Recursion;

public class LSrecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        System.out.println(linSearch(arr,3,0));
    }
    static boolean linearSearch(int[] arr, int target, int idx){
        //base case
        if (idx >= arr.length) return false;
        //self work
        if (target == arr[idx]) return true;
        // recursive work
        return linearSearch(arr, target, idx + 1);
    }
    static int linSearch(int[] arr, int target, int idx){
        if (idx >= arr.length) return -1;
        if (target == arr[idx]) return idx;
        return linSearch(arr,target,idx+1);
    }
}
