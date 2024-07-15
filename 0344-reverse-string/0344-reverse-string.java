class Solution {
    public void reverseString(char[] s) {
        int n = s.length;

        int si = 0;
        int ei = n-1;

        while(si < ei){
            char temp = s[si];
            s[si] = s[ei];
            s[ei] = temp;

            si++;
            ei--;
        }
    }
}