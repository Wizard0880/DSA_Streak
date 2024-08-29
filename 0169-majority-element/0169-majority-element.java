class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i  < nums.length ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Integer s : map.keySet()){
            if(map.get(s) > nums.length / 2){
                return s;
            }
        }
        return 0;
    }
}