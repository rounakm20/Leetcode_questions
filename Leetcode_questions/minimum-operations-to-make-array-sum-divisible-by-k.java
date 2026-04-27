class Solution {
    public int minOperations(int[] nums, int k) {
        long sum = 0;
        
        for (int num : nums) {
            sum += num;
        }
        
        int r = (int)(sum % k);
        return r;
    }
}
