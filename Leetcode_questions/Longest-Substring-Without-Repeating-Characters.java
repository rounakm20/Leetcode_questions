1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int low = 0;
4        HashMap<Character, Integer> freq = new HashMap<>();
5        int res = 0;
6
7        for (int high = 0; high < s.length(); high++) {
8
9            char ch = s.charAt(high);
10            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
11
12            int k = high - low + 1;
13
14            while (freq.size() < k) {
15                char leftChar = s.charAt(low);
16                freq.put(leftChar, freq.get(leftChar) - 1);
17
18                if (freq.get(leftChar) == 0) {
19                    freq.remove(leftChar);
20                }
21
22                low++;
23                k = high - low + 1;
24            }
25
26            int len = high - low + 1;
27            res = Math.max(res, len);
28        }
29
30        return res;
31    }
32}