1class Solution {
2    public List<String> twoEditWords(String[] queries, String[] dictionary) {
3        List<String> result = new ArrayList<>();
4
5        for (String q : queries) {
6            for (String d : dictionary) {
7                int diff = 0;
8
9                for (int i = 0; i < q.length(); i++) {
10                    if (q.charAt(i) != d.charAt(i)) {
11                        diff++;
12                    }
13                    if (diff > 2) break;
14                }
15
16                if (diff <= 2) {
17                    result.add(q);
18                    break;
19                }
20            }
21        }
22
23        return result;
24    }
25}