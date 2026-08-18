class Solution {
    
    class Pair {
        int first;
        char second;

        Pair(int first, char second) {
            this.first = first;
            this.second = second;
        }
    }

    public String reorganizeString(String s) {

        HashMap<Character, Integer> f = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            f.put(ch, f.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> b.first - a.first
        );

        for (Map.Entry<Character, Integer> i : f.entrySet()) {

            char elem = i.getKey();
            int freq = i.getValue();

            Pair curr = new Pair(freq, elem);

            pq.add(curr);
        }

        StringBuilder res = new StringBuilder();

        while (!pq.isEmpty()) {

            Pair p = pq.poll();

            if (res.length() == 0 || res.charAt(res.length() - 1) != p.second) {

                res.append(p.second);
                p.first--;

                if (p.first > 0) {
                    pq.add(p);
                }

            } else {

                if (pq.isEmpty()) {
                    return "";
                }

                Pair p2 = pq.poll();

                res.append(p2.second);
                p2.first--;

                if (p2.first > 0) {
                    pq.add(p2);
                }

                pq.add(p);
            }
        }

        return res.toString();
    }
}
