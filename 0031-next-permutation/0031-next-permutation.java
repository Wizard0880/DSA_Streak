class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx1 = -1;

        // Find the first decreasing element from the end
        for (int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                idx1 = i - 1;
                break;
            }
        }

        if (idx1 >= 0) {
            // Find the element just larger than nums[idx1]
            int idx2 = -1;
            for (int i = n - 1; i > idx1; i--) {
                if (nums[i] > nums[idx1]) {
                    idx2 = i;
                    break;
                }
            }

            // Swap the elements at idx1 and idx2
            int temp = nums[idx1];
            nums[idx1] = nums[idx2];
            nums[idx2] = temp;
        }

        // Reverse the elements after idx1
        Arrays.sort(nums, idx1 + 1, n );
    }
}    