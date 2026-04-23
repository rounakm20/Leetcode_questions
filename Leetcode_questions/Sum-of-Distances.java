1class Solution {
2    public long[] distance(int[] nums) {
3        HashMap<Integer, List<Integer>> hmap = new HashMap<>();
4
5        for (int i = 0; i < nums.length; i++) {
6            if (!hmap.containsKey(nums[i])) {
7                hmap.put(nums[i], new ArrayList<>());
8            }
9            hmap.get(nums[i]).add(i);
10        }
11
12        long[] ans = new long[nums.length];
13
14        for (List<Integer> list : hmap.values()) {
15            int n = list.size();
16
17            long leftsum = 0;
18            long rightsum = 0;
19
20            for (int i = 0; i < n; i++) {
21                rightsum += list.get(i);
22            }
23
24            for (int i = 0; i < n; i++) {
25                rightsum -= list.get(i);
26
27                long currsum = 0;
28
29                currsum += ((long) list.get(i) * i - leftsum);
30                currsum += (rightsum - (long) (n - i - 1) * list.get(i));
31
32                leftsum += list.get(i);
33
34                ans[list.get(i)] = currsum;
35            }
36        }
37
38        return ans;
39    }
40}