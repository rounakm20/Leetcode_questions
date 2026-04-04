1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        Arrays.sort(nums);
4        int n = nums.length;
5
6        List<List<Integer>> result = new ArrayList<>();
7
8        for (int i = 0; i < n - 2; i++) {
9
10            if (i > 0 && nums[i] == nums[i - 1]) continue;
11
12            int left = i + 1;
13            int right = n - 1;
14
15            while (left < right) {
16                int sum = nums[i] + nums[left] + nums[right];
17
18                if (sum == 0) {
19                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
20
21                    left++;
22                    right--;
23
24                    while (left < right && nums[left] == nums[left - 1]) left++;
25                    while (left < right && nums[right] == nums[right + 1]) right--;
26
27                } else if (sum < 0) {
28                    left++;
29                } else {
30                    right--;
31                }
32            }
33        }
34        return result;
35    }
36}