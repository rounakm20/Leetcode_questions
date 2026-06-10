class Solution {
    public int maximumSum(int[] arr) {
        int nodelete = arr[0];
        int onedelete = Integer.MIN_VALUE;
        int res = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int prevnodelete = nodelete;
            int prevonedelete = onedelete;

            int v1 = prevnodelete + arr[i];
            int v2 = arr[i];
            nodelete = Math.max(v1, v2);

            if (prevonedelete == Integer.MIN_VALUE) {
                onedelete = prevnodelete;
            } else {
                int d1 = prevonedelete + arr[i];
                int d2 = prevnodelete;
                onedelete = Math.max(d1, d2);
            }

            res = Math.max(res, Math.max(nodelete, onedelete));
        }

        return res;
    }
}
