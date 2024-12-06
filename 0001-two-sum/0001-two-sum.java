class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            int compliment = target - nums[i];
            if(mp.containsKey(compliment)){
                int arr[] = new int[2];
                arr[0] = mp.get(compliment);
                arr[1] = i;
                return arr;
            }
            mp.put(nums[i],i);
        }
        return new int[0];
    }
}