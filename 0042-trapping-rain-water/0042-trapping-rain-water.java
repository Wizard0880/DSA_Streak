class Solution {
    public int trap(int[] height) {
        int n = height.length;

        //leftmax Array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];

        for(int i = 1; i < n ;i++){
            leftmax[i] = Math.max(leftmax[i-1],height[i]);
        }

        // rightmax Array
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];

        for(int i = n-2; i >=0; i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }

        int trappedWater = 0;
        for(int i = 0; i < n; i++){
            int waterLevel = Math.min(leftmax[i],rightmax[i]) - height[i];
            trappedWater = trappedWater + waterLevel;
        }
        return trappedWater; 
    }
}