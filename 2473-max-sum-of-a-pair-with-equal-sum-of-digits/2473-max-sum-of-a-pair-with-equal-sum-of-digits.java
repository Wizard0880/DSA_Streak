class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, int[]> map = new HashMap<>();
        int gsum = -1;

        for (int num : nums) {
            int sum = digitSum(num);
            
            if (!map.containsKey(sum)) {
                map.put(sum, new int[]{num, -1}); // Initialize with first number
            } else {
                int[] pair = map.get(sum);
                if (num > pair[0]) {
                    pair[1] = pair[0]; // Move largest to second largest
                    pair[0] = num;
                } else if (num > pair[1]) {
                    pair[1] = num;
                }
            }
        }

        for (int[] pair : map.values()) {
            if (pair[1] != -1) {
                gsum = Math.max(gsum, pair[0] + pair[1]);
            }
        }

        return gsum;
    }

    private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
