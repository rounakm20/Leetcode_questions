class Solution {

    static long func(int[] piles, int n, int speed) {

        long m = 0;

        for (int i = 0; i < n; i++) {

            m = m + (piles[i] + speed - 1) / speed;
        }

        return m;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int n = piles.length;
        int low = 1;
        int high = 0;

        for (int banana : piles) {
            high = Math.max(high, banana);
        }

        int res = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long hours = func(piles, n, mid);

            if (hours > h) {
                low = mid + 1;
            } else {
                res = mid;
                high = mid - 1;
            }
        }

        return res;
    }
}
