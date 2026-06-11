class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int totalSum = nums[0];

        // Maximum Subarray Sum (Kadane)
        int best = nums[0];
        int res = nums[0];

        for (int i = 1; i < nums.length; i++) {
            totalSum += nums[i];

            int v1 = best + nums[i];
            int v2 = nums[i];

            best = Math.max(v1, v2);
            res = Math.max(res, best);
        }

        int a1 = res;

        // Minimum Subarray Sum
        best = nums[0];
        res = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int v1 = best + nums[i];
            int v2 = nums[i];

            best = Math.min(v1, v2);
            res = Math.min(res, best);
        }

        int a2 = res;

        // Edge Case: all numbers negative
        if (a1 < 0) {
            return a1;
        }

        return Math.max(a1, totalSum - a2);
    }
}
