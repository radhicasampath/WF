public class MaximumSubarray {
    public int maxSubArray(int[] a) {
        int n = a.length;
        int[] dp = new int[n];//dp[i] means the maximum subarray ending with A[i];
        dp[0] = a[0];
        int max = dp[0];

        for(int i = 1; i < n; i++){
            dp[i] = a[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(new MaximumSubarray().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
