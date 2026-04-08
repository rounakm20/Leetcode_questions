1class Solution {
2    public int totalFruit(int[] fruits) {
3        int left = 0;
4        int maxLen = 0;
5        HashMap<Integer, Integer> freq = new HashMap<>();
6
7        for (int right = 0; right < fruits.length; right++) {
8            freq.put(fruits[right], freq.getOrDefault(fruits[right], 0) + 1);
9
10            while (freq.size() > 2) {
11                int leftFruit = fruits[left];
12                freq.put(leftFruit, freq.get(leftFruit) - 1);
13
14                if (freq.get(leftFruit) == 0) {
15                    freq.remove(leftFruit);
16                }
17                left++;
18            }
19
20            maxLen = Math.max(maxLen, right - left + 1);
21        }
22
23        return maxLen;
24    }
25}