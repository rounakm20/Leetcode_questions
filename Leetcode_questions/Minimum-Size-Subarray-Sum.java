1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int low = 0 ;
4        int high = 0;
5        int sum = 0;
6       int  result = Integer.MAX_VALUE ;
7        while (high < nums.length) {
8            sum = sum + nums[high];
9            while (sum >= target ) {
10                sum = sum - nums[low];
11                int t = high - low + 1;
12                result = Math.min(result ,t );
13                low++;
14            }
15            high ++;
16        }
17        return result == Integer.MAX_VALUE ? 0 : result;
18    }
19}