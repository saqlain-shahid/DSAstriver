import java.util.ArrayList;
import java.util.Arrays;

public class LCQ2149 {
   //    https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
   public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
       int[] ans = rearrangeArray(arr);
       System.out.println(Arrays.toString(ans));
   }
    static public int[] rearrangeArray(int[] nums){
       int pos=0;
       int neg=1;
       int n=nums.length;
       int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0){
                ans[pos]=nums[i];
                pos+=2;
            }
            else {
                ans[neg]=nums[i];
                neg+=2;
            }

        }
        return ans;
    }
}
