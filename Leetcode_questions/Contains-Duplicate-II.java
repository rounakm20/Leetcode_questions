1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        HashSet<Integer> set = new HashSet<>();
4
5        for (int i = 0; i < nums.length; i++) {
6
7            if (set.contains(nums[i])) {
8                return true;
9            }
10
11            set.add(nums[i]);
12
13            if (set.size() > k) {
14                set.remove(nums[i - k]);
15            }
16        }
17
18        return false;
19    }
20}