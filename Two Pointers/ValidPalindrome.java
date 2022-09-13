class SoluValidPalindrometion {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean flag = isPalindrome(s);
        System.out.println(flag);
    }

    public static boolean isPalindrome(String s) {
        s = s.trim().toLowerCase();
        System.out.println(s);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z' || '0' <= s.charAt(i) && s.charAt(i) <= '9' ) {
                sb.append(s.charAt(i));
            }
        }

        for (int i = 0; i < sb.length()/2; i++) {
            if (sb.charAt(i) != sb.charAt(sb.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}