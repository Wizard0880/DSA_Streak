class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int lp = 0;
        int rp = 0;

        // Pivot element
        for(int i = 0; i < n-1 ;i++){
            if(nums[i] > nums[i+1]){
                //lp = i;
                rp = i+1;
            }
        }
        return nums[rp];
    }
}

