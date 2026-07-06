class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        boolean odd = false;
        int res = 0;

        for (char i : map.keySet()) {
            int val = map.get(i);

            if (val % 2 == 0) {
                res += val;
            } else {
                odd = true;
            }
        }

        for (char i : map.keySet()) {
            int val = map.getOrDefault(i, 0);
            if (val % 2 == 1) {
                res += val - 1;
            }
        }

        if (odd == false) {
            return res;
        }

        return res + 1;
    }
}
