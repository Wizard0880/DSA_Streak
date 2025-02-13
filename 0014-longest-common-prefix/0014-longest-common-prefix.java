class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);

        String a = strs[0];
        String b = strs[strs.length - 1];

        int i = 0;
        while(i < a.length() && i < b.length()){
            if(a.charAt(i) != b.charAt(i)){
                break;
            }
            sb.append(a.charAt(i));
            i++;
        }
        return sb.toString();
    }
}