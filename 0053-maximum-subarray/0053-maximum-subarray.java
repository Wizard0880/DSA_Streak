// class Solution {
//     public int maxSubArray(int[] nums) {
//         int maxSum = Integer.MIN_VALUE;
//         int negSum = Integer.MAX_VALUE;
//         int currSum = 0;
//         boolean allNeg = true;

//         for(int i = 0; i < nums.length ; i++){
//             currSum = currSum + nums[i];
//             if(currSum < 0){
//                 currSum = 0;
//             }
//             maxSum = Math.max(maxSum,currSum);
            
//             if(nums[i] >= 0){
//                 allNeg = false;
//             }

//             negSum = Math.max(negSum,nums[i]);

//             if(allNeg){
//                 return negSum;
//             }
//         }
//         return maxSum;
//     }
// }
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];

        for(int i = 1; i < nums.length ; i++){
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}
