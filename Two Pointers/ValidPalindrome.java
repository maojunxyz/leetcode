class SoluValidPalindrometion {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean flag = isPalindrome(s);
        System.out.println(flag);
    }

    /**
     * Use two pointers Time: O(n) Space: O(1)
     * 
     * @param s palindrome
     * @return ture or false
     */
    public static boolean isPalindrome(String s) {
        s = s.trim().toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char begin = s.charAt(i);
            char end = s.charAt(j);
            if (!Character.isLetterOrDigit(begin)) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(end)) {
                j--;
                continue;
            }
            if (begin != end) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    /**
     * Use two pointers Time: O(n) Space: O(1)
     * 
     * @param s palindrome
     * @return ture or false
     */
    public static boolean isPalindrome1(String s) {
        s = s.trim().toLowerCase();
        System.out.println(s);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z' || '0' <= s.charAt(i) && s.charAt(i) <= '9') {
                sb.append(s.charAt(i));
            }
        }

        for (int i = 0; i < sb.length() / 2; i++) {
            if (sb.charAt(i) != sb.charAt(sb.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}