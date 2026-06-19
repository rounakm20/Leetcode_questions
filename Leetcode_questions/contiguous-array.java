import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findMaxLength(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        int zeros = 0;
        int ones = 0;
        int res = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0)
                zeros++;
            else
                ones++;

            int diff = zeros - ones;

            if (diff == 0) {
                res = Math.max(res, i + 1);
            }
            else if (map.containsKey(diff)) {
                res = Math.max(res, i - map.get(diff));
            }
            else {
                map.put(diff, i);
            }
        }

        return res;
    }
}
