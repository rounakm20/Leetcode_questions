1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int low = 0; 
4        int high = 1;
5        int k = 1;
6
7        while (high < nums.length) {
8            if (nums[low] == nums[high]) {
9                high++;
10                continue;
11            }
12            low++;
13            nums[low] = nums[high];
14            high++;
15            k++;
16        }
17        return k;
18    }
19}