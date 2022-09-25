package BitManipulation;

class SingleNumber {
    public static void main(String[] args) {
        int[] nums = { 4, 1, 2, 1, 2 };
        System.out.println(singleNumber(nums));
    }

    /**
     * Use iteratively search Time: O(n) Space: O(1)
     * 
     * @param nums
     * @return single num
     */
    public static int singleNumber(int[] nums) {
        int single = nums[0];
        for (int i = 1; i < nums.length; i++) {
            single ^= nums[i];
        }
        return single;

    }

}