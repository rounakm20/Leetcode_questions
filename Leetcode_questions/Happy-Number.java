1import java.util.*;
2
3class Solution {
4    public boolean isHappy(int n) {
5        HashSet<Integer> set = new HashSet<>();
6
7        while (n != 1 && !set.contains(n)) {
8            set.add(n);
9            n = squareSum(n);
10        }
11
12        return n == 1;
13    }
14
15    public int squareSum(int n) {
16        int sum = 0;
17        while (n > 0) {
18            int rem = n % 10;
19            sum += rem * rem;
20            n /= 10;
21        }
22        return sum;
23    }
24}