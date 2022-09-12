import java.util.Arrays;
import java.util.HashMap;

class Solution {

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 7, 9 };
        int target = 14;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));

    }

    /**
     * Use hashmap Time: O(n) Space: O(n)
     * 
     * @param nums
     * @param targetk
     * @return indices of the two numbers R
     */
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            if (map.containsKey(num)) {
                return new int[] { map.get(num), i };
            }
            map.put(diff, i);
        }
        return new int[] {};
    }

    /**
     * double foreach Time: O(n^2) Space: O(1)
     * 
     * @param nums
     * @param target
     * @return indices of the two numbers
     */
    public static int[] twoSum1(int[] nums, int target) {

        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                total = nums[i] + nums[j];
                if (target == total) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

}