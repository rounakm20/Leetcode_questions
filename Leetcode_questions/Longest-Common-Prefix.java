1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        if (strs == null || strs.length == 0) return "";
4
5        String prefix = strs[0];
6
7        for (int i = 1; i < strs.length; i++) {
8            while (strs[i].indexOf(prefix) != 0) {
9                prefix = prefix.substring(0, prefix.length() - 1);
10                
11                if (prefix.isEmpty()) return "";
12            }
13        }
14        return prefix;
15    }
16}