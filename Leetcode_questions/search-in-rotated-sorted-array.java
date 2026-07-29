class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] > nums[nums.length - 1]) {

                if (nums[mid] < target) {
                    low = mid + 1;
                } else {
                    if (nums[mid] > target) {

                        // Mistake 1 Fixed
                        if (target <= nums[nums.length - 1]) {
                            low = mid + 1;
                        } else {
                            high = mid - 1;
                        }

                    } else {
                        high = mid - 1;
                    }
                }

                continue;

            } else {

                if (nums[mid] > target) {
                    high = mid - 1;
                } else {
                    if (nums[mid] < target) {

                        // Mistake 2 Fixed
                        if (target > nums[nums.length - 1]) {
                            high = mid - 1;
                        } else {
                            low = mid + 1;
                        }

                    } else {
                        low = mid + 1;
                    }
                }
            }
        }

        return -1;
    }
}
