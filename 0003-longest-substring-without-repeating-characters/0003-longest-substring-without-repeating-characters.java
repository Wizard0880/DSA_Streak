class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0 , right = 0;
        int max = 0;
        int n = s.length();
        HashSet<Character> set = new HashSet<>();

        while(right < n){
            char c = s.charAt(right);
            if(set.add(c)){

                max = Math.max(max,right - left + 1);
                right++;
            }else{
                while(s.charAt(left) != c){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}