import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 4, 5, 3 };
        System.out.println(containsDuplicate(nums));
    }

    /**
     * Use hashset Time: O(n) Space: O(n)
     *
     * @param nums arrays
     * @return True or False
     */
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    /**
     * Use sort Time: O(nlogn) Space: O(1)
     *
     * @param nums arrays
     * @return True or False
     */
    public static boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    /**
     * Direct Search Time: O(n^2) Space: O(1)
     *
     * @param nums arrays
     * @return True or False
     */
    public static boolean containsDuplicate3(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
