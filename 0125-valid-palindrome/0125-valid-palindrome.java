class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();

        s = s.toLowerCase();

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < n ; i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }

        String p = sb.toString();
        int m = p.length();
        for(int i = 0; i < m/2 ;i++){
            if(p.charAt(i) != p.charAt(m-i-1)){
                return false;
            }
        }
        return true;
    }
}