class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int best = nums[0];
        int res = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int v1 = best + nums[i];
            int v2 = nums[i];

            best = Math.max(v1, v2);
            res = Math.max(res, best);
        }

        int s2 = res;

        best = nums[0];
        res = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int v1 = best + nums[i];
            int v2 = nums[i];

            best = Math.min(v1, v2);
            res = Math.min(res, best);
        }

        int s1 = Math.abs(res);

        return Math.max(s1, s2);
    }
}
