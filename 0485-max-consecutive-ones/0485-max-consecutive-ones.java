class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0; 
        int max = 0;  
        for (int i = 0; i < n; i++) {  
            if (nums[i] == 1) {
                count++;  
                max = Math.max(max, count);  
            } else {
                max = Math.max(max, count);
                count = 0; 
            }
        }
        max = Math.max(max, count);
        return max;
    }
}
