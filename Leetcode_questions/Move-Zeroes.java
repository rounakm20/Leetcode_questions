1class Solution {
2    public void moveZeroes(int[] nums) {
3        int k = 0;
4
5        for (int i = 0; i < nums.length; i++) {
6            if (nums[i] != 0) {
7                nums[k] = nums[i];
8                k++;
9            }
10        }
11
12       
13        for (int i = k; i < nums.length; i++) {
14            nums[i] = 0;
15        }
16    }
17}