package Recursion;

public class Arrays {
    public static void main(String[] args) {
        int[] ar = {5,6,7,8,9};
        arr(ar,0);
    }
    static void arr(int[] arr, int indx){
        //base case
        if (indx == arr.length) return;
        //self work
        System.out.print(arr[indx] + " ");
        //recursive work
        arr(arr,indx+1);

    }
}
