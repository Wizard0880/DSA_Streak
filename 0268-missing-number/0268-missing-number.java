class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
       int SUM = 0;

        for(int i = 0; i < n; i++){
            SUM = SUM + nums[i];
        }

        // for(int i = 0; i < n; i++){
        //     SUM = SUM + i;
        // }

        int sum = (n * (n+1)) / 2;

    return sum - SUM;    
    }
}