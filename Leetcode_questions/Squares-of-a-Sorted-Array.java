1import java.util.*;
2
3class Solution {
4    public int[] sortedSquares(int[] nums) {
5        ArrayList<Integer> pos = new ArrayList<>();
6        ArrayList<Integer> neg = new ArrayList<>();
7
8        for (int num : nums) {
9            if (num < 0)
10                neg.add(num);
11            else
12                pos.add(num);
13        }
14
15        // square neg
16        for (int i = 0; i < neg.size(); i++) {
17            neg.set(i, neg.get(i) * neg.get(i));
18        }
19        Collections.reverse(neg);
20
21        // square pos
22        for (int i = 0; i < pos.size(); i++) {
23            pos.set(i, pos.get(i) * pos.get(i));
24        }
25
26        int n1 = neg.size();
27        int n2 = pos.size();
28        int[] res = new int[n1 + n2];
29
30        int i = 0, j = 0, id = 0;
31
32        while (i < n1 && j < n2) {
33            if (neg.get(i) <= pos.get(j)) {
34                res[id++] = neg.get(i++);
35            } else {
36                res[id++] = pos.get(j++);
37            }
38        }
39
40        while (i < n1) {
41            res[id++] = neg.get(i++);
42        }
43
44        while (j < n2) {
45            res[id++] = pos.get(j++);
46        }
47
48        return res;
49    }
50}