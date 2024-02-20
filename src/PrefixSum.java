import java.lang.reflect.Array;
import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5};
        int[] ans = inPlace(a);
        System.out.println(Arrays.toString(ans));
    }
    static int[] prefix(int[] arr){
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    }
    static int[] inPlace(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n ; i++) {
            arr[i] += arr[i-1];
        }
        return arr;
    }
}
