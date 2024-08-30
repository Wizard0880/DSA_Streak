class Solution {
    public int maxSubArray(int[] nums) {
        int cs = 0;
        int maxi =Integer.MIN_VALUE;
        int n = nums.length;

        for(int i = 0 ; i  < n; i++){
            cs = cs + nums[i];
            maxi = Math.max(maxi,cs);
            if(cs < 0){
                cs = 0;
            }
        }
        return maxi;
    }
}