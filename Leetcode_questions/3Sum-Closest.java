1class Solution {
2    public int threeSumClosest(int[] nums, int target) {
3        Arrays.sort(nums);
4        int n = nums.length;
5
6        int closestSum = nums[0] + nums[1] + nums[2];
7
8        for (int i = 0; i < n - 2; i++) {
9
10            int left = i + 1;
11            int right = n - 1;
12
13            while (left < right) {
14                int sum = nums[i] + nums[left] + nums[right];
15
16                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
17                    closestSum = sum;
18                }
19
20                if (sum < target) {
21                    left++;
22                } else {
23                    right--;
24                }
25            }
26        }
27        return closestSum;
28    }
29}