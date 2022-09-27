import java.util.Arrays;

class CountingBits {
    public static void main(String[] args) {
        int n = 5;
        int[] ans = countBits(n);
        System.out.println(Arrays.toString(ans));
    }

    /**
     * Use iteratively search Time: O(n) Space: O(n)
     * 
     * @param n
     * @return int[]
     */
    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            ans[i] = count(i);
        }
        return ans;

    }

    private static int count(int x) {
        int count = 0;
        while (x != 0) {
            x &= x - 1;
            count++;
        }
        return count;
    }
}