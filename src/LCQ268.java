public class LCQ268 {
    public static void main(String[] args) {
//https://leetcode.com/problems/missing-number/description/
        int[] arr = {1,2,4,5};
        System.out.println(missingNum(arr));
    }
    static int missingNum(int[] arr){
        int xor = 0;
        for (int i = 0; i <= arr.length; i++) {
            xor = xor^i;
        }
        for (int num:arr) {
            xor = xor^num;
        }
        return xor;
    }
    static int miss(int[] nums){
        int n = nums.length;

        long actualSum = (n*(n+1))/2;

        long sum=0;
        for(int i=0; i<=nums.length-1;i++){
            sum+=nums[i];
        }
        return (int)(actualSum-sum);
    }
}
