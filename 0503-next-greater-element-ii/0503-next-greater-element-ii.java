class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[n];

        for(int i = 2 * n - 1; i >= 0; i--){
            while(!s.isEmpty() && nums[s.peek()] <= nums[i % n]){
                s.pop();
            }

            if(i < n){
                if(s.isEmpty()){
                    nextGreater[i] = -1;
                } else {
                    nextGreater[i] = nums[s.peek()];
                }
            }
            s.push(i % n);
        }
        return nextGreater;
    }
}
