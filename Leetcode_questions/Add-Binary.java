1class Solution {
2    public String addBinary(String a, String b) {
3        int i = a.length() - 1;
4        int j = b.length() - 1;
5        int carry = 0;
6
7        String result = "";
8
9        while (i >= 0 || j >= 0 || carry == 1) {
10            int sum = carry;
11
12            if (i >= 0) {
13                sum += a.charAt(i) - '0';
14                i--;
15            }
16
17            if (j >= 0) {
18                sum += b.charAt(j) - '0';
19                j--;
20            }
21
22            result = (sum % 2) + result; 
23            carry = sum / 2;
24        }
25
26        return result;
27    }
28}