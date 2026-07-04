class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();

        // Count frequency
        for (int i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        // Find first character whose frequency is 1
        for (int j = 0; j < n; j++) {
            if (map.get(s.charAt(j)) == 1) {
                return j;
            }
        }

        return -1;
    }
}
