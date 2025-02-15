class Solution {
    public int punishmentNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            String s = Integer.toString(square);
            if (canSplit(s, i)) {
                sum += square;
            }
        }
        return sum;
    }
    
    private boolean canSplit(String s, int target) {
        return helper(s, target, 0);
    }
    
    private boolean helper(String s, int remaining, int start) {
        if (start == s.length()) {
            return remaining == 0;
        }
        for (int end = start + 1; end <= s.length(); end++) {
            String part = s.substring(start, end);
            int num = Integer.parseInt(part);
            if (num > remaining) {
                break;
            }
            if (helper(s, remaining - num, end)) {
                return true;
            }
        }
        return false;
    }
}