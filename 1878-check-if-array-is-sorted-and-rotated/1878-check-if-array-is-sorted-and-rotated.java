class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        boolean foundViolation = false;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                if (foundViolation) {
                    return false;
                }
                foundViolation = true;
            }
        }
        if (foundViolation && nums[n - 1] > nums[0]) {
            return false;
        }
        return true;
    }
}