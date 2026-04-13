1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        Arrays.sort(nums);
4        for ( int i = 0 ; i < nums.length - 1; i ++) {
5            if(nums[i] == nums[i+1])  return true; 
6        }
7        return false;
8    }
9}