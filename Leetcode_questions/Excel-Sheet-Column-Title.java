1class Solution {
2    public String convertToTitle(int columnNumber) {
3        String result = "";
4        int n = columnNumber;
5
6        while (n > 0) {
7            n--; 
8            int rem = n % 26;
9
10            char ch = (char)('A' + rem);
11            result = ch + result;
12
13            n = n / 26;
14        }
15
16        return result;
17    }
18}