class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        HashSet<Character> set = new HashSet<>();

        int i = 0;
        int j = 0;
        int maxi = 0;

        while(j < n){
            char c = s.charAt(j);
            if(!set.contains(c)){
                set.add(c);
                maxi = Math.max(maxi,j-i+1);
                j++;
            }else{
                while(s.charAt(i) != c){
                    set.remove(s.charAt(i));
                    i++;
                }
                i++;
                j++;
            }
        }
        return maxi;
    }
}