class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int lp = 0;
        int rp = n-1;
        int maxWater = Integer.MIN_VALUE;

        while(lp < rp){
            int WaterLevel = Math.min(height[lp],height[rp]);
            int width = rp - lp;
            int pani = WaterLevel * width;
            maxWater = Math.max(maxWater,pani);
           if(height[lp]<height[rp]){
            lp++;
           }else{
            rp--;
           }
        }
        return maxWater;
    }
}