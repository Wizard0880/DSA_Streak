class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);

        int p = nums[nums.length-k];
        
        return p;
    }
}