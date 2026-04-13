1class Solution {
2    public int missingNumber(int[] nums) {
3        int n = nums.length;
4        int sum = 0;
5        int expectedSum = n * (n + 1) / 2;
6
7        for(int i = 0; i < nums.length; i++){
8            sum += nums[i];
9        }
10
11        return expectedSum - sum;
12    }
13}