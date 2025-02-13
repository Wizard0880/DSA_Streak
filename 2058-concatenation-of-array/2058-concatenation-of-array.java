class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int arr[] = new int[2*n];
        int i = 0;
        int j = 0; 
        while(i < n){
            arr[j] = nums[i];
            i++;
            j++;
        }
        i = 0;
        while(i < n){
            arr[j] = nums[i];
            i++;
            j++;
        }

        return arr;
    }
}