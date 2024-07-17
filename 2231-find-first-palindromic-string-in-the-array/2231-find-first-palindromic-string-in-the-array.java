class Solution {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return ""; 
    }

    private boolean isPalindrome(String s) {
        int m = s.length();
        for (int i = 0; i < m / 2; i++) {
            if (s.charAt(i) != s.charAt(m - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
