1class Solution {
2    public int titleToNumber(String columnTitle) {
3        int result = 0;
4
5        for (int i = 0; i < columnTitle.length(); i++) {
6            char ch = columnTitle.charAt(i);
7            int value = ch - 'A' + 1;
8
9            result = result * 26 + value;
10        }
11
12        return result;
13    }
14}