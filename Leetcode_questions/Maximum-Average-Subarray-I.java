1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int low = 0;
4        int high = k - 1;
5
6        int sum = 0;
7
8        
9        for (int i = 0; i <= high; i++) {
10            sum = sum + nums[i];
11        }
12
13        double avg = (double) sum / k;
14        double res = avg;
15
16        while (high < nums.length - 1) {
17
18            low++;
19            high++;
20
21            sum = sum - nums[low - 1];   // remove previous element
22            sum = sum + nums[high];     // add new element
23
24            avg = (double) sum / k;
25
26            res = Math.max(res, avg);
27        }
28
29        return res;
30    }
31}