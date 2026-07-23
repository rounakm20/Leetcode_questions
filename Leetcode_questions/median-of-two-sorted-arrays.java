class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i = 0;
        int j = 0;
        int k = 0;

        int[] res = new int[m + n];

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                res[k++] = nums1[i++];
            } else {
                res[k++] = nums2[j++];
            }
        }

        while (i < m) {
            res[k++] = nums1[i++];
        }

        while (j < n) {
            res[k++] = nums2[j++];
        }

       
      

        int p = res.length;

        if (p % 2 == 1) {
              return res[k / 2];
        } else {
                return (res[p / 2] + res[p / 2 - 1]) / 2.0;
        }
    }
}
