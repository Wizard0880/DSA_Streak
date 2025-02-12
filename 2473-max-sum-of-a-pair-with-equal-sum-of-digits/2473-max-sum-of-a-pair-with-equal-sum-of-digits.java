class Solution {
    public int maximumSum(int[] nums) {

        Arrays.sort(nums);
        int gsum = -1;
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();

        for(int i : nums){
            int sum = Digitsum(i);
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }

        for(int i : map.keySet()){
            ArrayList<Integer> al = map.get(i);
            int l = al.size();
            if(l > 1){
                gsum = Math.max(gsum, al.get(l-1) + al.get(l-2));
            }
        }
        return gsum;
    }

    public int Digitsum(int num){
        int sum = 0;
        while(num > 0){
            sum = num % 10 + sum;
            num = num / 10;
        }
        return sum;
    }
}