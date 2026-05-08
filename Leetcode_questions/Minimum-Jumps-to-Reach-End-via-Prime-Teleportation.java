class Solution {

    public int minJumps(int[] nums) {

        int n = nums.length;

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            for (int d = 1; d * d <= nums[i]; d++) {

                if (nums[i] % d == 0) {

                    map.computeIfAbsent(d, k -> new ArrayList<>()).add(i);

                    if (d * d != nums[i])
                        map.computeIfAbsent(nums[i] / d, k -> new ArrayList<>()).add(i);
                }
            }
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n];
        Set<Integer> used = new HashSet<>();

        q.offer(0);
        vis[0] = true;

        int step = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            while (size-- > 0) {

                int i = q.poll();

                if (i == n - 1) return step;

                if (i > 0 && !vis[i - 1]) {
                    vis[i - 1] = true;
                    q.offer(i - 1);
                }

                if (i + 1 < n && !vis[i + 1]) {
                    vis[i + 1] = true;
                    q.offer(i + 1);
                }

                if (prime(nums[i]) && used.add(nums[i])) {

                    for (int j : map.get(nums[i])) {

                        if (!vis[j]) {
                            vis[j] = true;
                            q.offer(j);
                        }
                    }
                }
            }

            step++;
        }

        return -1;
    }

    boolean prime(int x) {

        if (x < 2) return false;

        for (int i = 2; i * i <= x; i++)
            if (x % i == 0) return false;

        return true;
    }
}
