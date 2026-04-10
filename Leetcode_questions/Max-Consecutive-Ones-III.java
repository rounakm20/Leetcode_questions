1class Solution {
2    public int longestOnes(int[] nums, int k) {
3
4        int low = 0;
5        int res = 0;
6        int zeroCount = 0;   
7
8        for (int high = 0; high < nums.length; high++) {
9
10          
11            if (nums[high] == 0) {
12                zeroCount++;
13            }
14
15            
16            while (zeroCount > k) {
17                if (nums[low] == 0) {
18                    zeroCount--;
19                }
20                low++;
21            }
22
23            int len = high - low + 1;
24            res = Math.max(res, len);
25        }
26
27        return res;
28    }
29}