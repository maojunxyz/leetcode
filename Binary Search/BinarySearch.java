class BinarySearch {

    public static void main(String[] args) {
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = 9;
        System.out.println(search(nums, target));
    }

    /**
     * Use binary search Time: O(log(n)/log(2)) Space: O(1)
     * 
     * @param nums
     * @param targetk
     * @return indices of the nums
     */
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (target < nums[mid]) {
                right = mid - 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * Use foreach search Time: O(n) Space: O(1)
     * 
     * @param nums
     * @param targetk
     * @return indices of the nums
     */
    public static int search1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            }
        }
        return -1;
    }
}