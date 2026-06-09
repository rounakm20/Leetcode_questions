class Solution {
    public int maxSubArray(int[] nums) {
        int best = nums[0];
        int ans = nums[0];

        for( int i = 1 ; i < nums.length ; i++){
            int v1= best + nums[i];
            int v2 = nums[i];
            best = Array.max( v1 , v2);
            ans = Array.max(ans , best);
        }

        return ans ;
    }
}
