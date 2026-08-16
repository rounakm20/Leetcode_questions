class Solution {

    class Pair {
        int first;
        String second;

        Pair(int first, String second) {
            this.first = first;
            this.second = second;
        }
    }

    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> f = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            f.put(words[i], f.getOrDefault(words[i], 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.first != b.first)
                return a.first - b.first;

            return b.second.compareTo(a.second);
        });

        for (Map.Entry<String, Integer> i : f.entrySet()) {

            String elem = i.getKey();
            int freq = i.getValue();

            Pair curr = new Pair(freq, elem);

            pq.add(curr);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        List<String> res = new ArrayList<>();

        while (!pq.isEmpty()) {
            res.add(pq.poll().second);
        }

        Collections.reverse(res);

        return res;
    }
}
