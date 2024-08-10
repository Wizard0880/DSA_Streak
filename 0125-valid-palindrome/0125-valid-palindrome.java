class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();

        for(int i = 0; i < n ;i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }

        String p = sb.toString();
        int m = p.length();
        for(int i = 0;i < m;i++){
            if(p.charAt(i) != p.charAt(m-i-1)){
                return false;
            }
        }

        return true;
    }
}