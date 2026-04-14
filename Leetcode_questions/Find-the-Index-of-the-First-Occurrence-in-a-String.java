1class Solution {
2    public int strStr(String haystack, String needle) {
3
4        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
5
6            int j = 0;
7
8            for (j = 0; j < needle.length(); j++) {
9                if (haystack.charAt(i + j) != needle.charAt(j)) {
10                    break; 
11                }
12            }
13
14            if (j == needle.length()) {
15                return i; 
16            }
17        }
18
19        return -1;
20    }
21}