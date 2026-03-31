1class Solution {
2    public String removeDigit(String number, char digit) {
3        String ans = "";
4
5        for (int i = 0; i < number.length(); i++) {
6            if (number.charAt(i) == digit) {
7
8                String newStr = number.substring(0, i) + number.substring(i + 1);
9
10                if (ans.equals("") || newStr.compareTo(ans) > 0) {
11                    ans = newStr;
12                }
13            }
14        }
15
16        return ans;
17    }
18}