import java.util.*;

class Solution {
    public int maxNumberOfBalloons(String text) {

        HashMap<Character, Integer> have = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();

        // Frequency of text
        for (char ch : text.toCharArray()) {
            have.put(ch, have.getOrDefault(ch, 0) + 1);
        }

        // Frequency of ballon
        String word = "balloon";
        for (char ch : word.toCharArray()) {
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        int res = Integer.MAX_VALUE;

        for (char c : need.keySet()) {
            int neededCount = need.get(c);
            int haveCount = have.getOrDefault(c, 0);

            int times = haveCount / neededCount;

            res = Math.min(res, times);
        }

        return res;
    }
}
