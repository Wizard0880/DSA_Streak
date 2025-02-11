class Solution {
    public String removeOccurrences(String s, String part) {

        StringBuilder sb = new StringBuilder(s);

        while(sb.toString().indexOf(part) != -1){
           sb = check(sb.toString(),part);
        }

        return sb.toString();
    }

    public StringBuilder check(String s, String part){

        int idx = s.indexOf(part);
        StringBuilder sb = new StringBuilder();
        String a = "";
        String b = "";

        a = s.substring(0,idx);
        b = s.substring(idx + part.length());

        sb.append(a);
        sb.append(b);

        return sb;
    }
}