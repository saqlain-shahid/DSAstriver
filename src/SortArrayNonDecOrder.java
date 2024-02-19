import java.util.Arrays;

public class SortArrayNonDecOrder {
    public static void main(String[] args) {
        int[] arr = {-8, -2, 5, 4, -12};
        int[] ans = sort(arr);

        // Print the sorted array 'ans'
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    static int[] sort(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int k = n - 1;
        int[] ans = new int[n];

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k--] = arr[left] * arr[left];
                left++;
            } else {
                ans[k--] = arr[right] * arr[right];
                right--;
            }
        }

        // Sort the array of squared values
        Arrays.sort(ans);

        return ans;
    }
}
