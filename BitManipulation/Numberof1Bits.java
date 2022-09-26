package BitManipulation;

public class Numberof1Bits {
    public static void main(String[] args) {
        // 00000000000000000000000000001011
        int n =11;
        System.out.println(hammingWeight(n));
    }

    /**
     * Use iteratively search Time: O(n) Space: O(1)
     * 
     * @param n
     * @return count
     */
    public static int hammingWeight(int n) {
        int count =0;
        while(n !=0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}