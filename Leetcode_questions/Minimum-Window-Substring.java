1public class Solution {
2    public String minWindow(String s, String t) {
3        if (s.length() == 0 || t.length() == 0) return "";
4
5        int[] freq = new int[128];
6        for (char c : t.toCharArray()) {
7            freq[c]++;
8        }
9
10        int left = 0, right = 0;
11        int required = t.length();
12        int minLen = Integer.MAX_VALUE;
13        int start = 0;
14
15        while (right < s.length()) {
16            char r = s.charAt(right);
17            if (freq[r] > 0) required--;
18            freq[r]--;
19            right++;
20
21            while (required == 0) {
22                if (right - left < minLen) {
23                    minLen = right - left;
24                    start = left;
25                }
26
27                char l = s.charAt(left);
28                freq[l]++;
29                if (freq[l] > 0) required++;
30                left++;
31            }
32        }
33
34        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
35    }
36}