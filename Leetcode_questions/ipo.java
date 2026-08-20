class Solution {

    class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {

        int n = profits.length;

        Pair[] proj = new Pair[n];

        for (int i = 0; i < n; i++) {
            proj[i] = new Pair(capital[i], profits[i]);
        }

        Arrays.sort(proj, (a, b) -> a.first - b.first);

        int idx = 0;

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        while (k > 0) {

            while (idx < n && proj[idx].first <= w) {
                pq.offer(proj[idx].second);
                idx++;
            }

            if (pq.isEmpty()) {
                return w;
            }

            w += pq.poll();
            k--;
        }

        return w;
    }
}
