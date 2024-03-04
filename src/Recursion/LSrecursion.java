package Recursion;

import java.util.ArrayList;

public class LSrecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,3,5,2,2,2,2,2};
//        System.out.println(linSearch(arr,3,0));
//        printAllIndices(arr,2,0);

        ArrayList<Integer> ans = allIndices(arr,2,0);
        System.out.println(ans);

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
    static void printAllIndices(int[] arr, int target, int idx){
        if (idx>= arr.length) return;

        if (arr[idx]==target) System.out.println(idx);

         printAllIndices(arr,target,idx+1);
    }

    static ArrayList<Integer> allIndices(int[] arr, int target, int idx){
        ArrayList<Integer> ans = new ArrayList<>();
        //base case
        if (idx>=arr.length) return ans; //empty arrayList
        //self work
        if (arr[idx]==target) { // ans-> {0}
            ans.add(idx);
        }
        //recursive work
        ArrayList<Integer> smallAns = allIndices(arr,target, idx+1);
        ans.addAll(smallAns);  // all indixes combined
        return ans;
    }
}
