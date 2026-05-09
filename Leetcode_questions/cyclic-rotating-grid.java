class Solution {
    public int[][] rotateGrid(int[][] g, int k) {
        int m = g.length, n = g[0].length;

        for (int l = 0; l < Math.min(m, n) / 2; l++) {

            ArrayList<Integer> a = new ArrayList<>();

            for (int j = l; j < n - l; j++) a.add(g[l][j]);
            for (int i = l + 1; i < m - l; i++) a.add(g[i][n - l - 1]);
            for (int j = n - l - 2; j >= l; j--) a.add(g[m - l - 1][j]);
            for (int i = m - l - 2; i > l; i--) a.add(g[i][l]);

            int s = a.size(), r = k % s, idx = 0;

            for (int j = l; j < n - l; j++) g[l][j] = a.get((idx++ + r) % s);
            for (int i = l + 1; i < m - l; i++) g[i][n - l - 1] = a.get((idx++ + r) % s);
            for (int j = n - l - 2; j >= l; j--) g[m - l - 1][j] = a.get((idx++ + r) % s);
            for (int i = m - l - 2; i > l; i--) g[i][l] = a.get((idx++ + r) % s);
        }

        return g;
    }
}
