class Solution {
    public int minimumEffort(int[][] tasks) {

        Arrays.sort(tasks, (a, b) ->
            (b[1] - b[0]) - (a[1] - a[0])
        );

        int energy = 0;
        int current = 0;

        for (int[] t : tasks) {

            if (current < t[1]) {
                energy += t[1] - current;
                current = t[1];
            }

            current -= t[0];
        }
        return energy;
    }
}
