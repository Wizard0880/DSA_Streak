class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i : nums1){
            list.add(i);
        }
        for(int i : nums2){
            list.add(i);
        }

        Collections.sort(list);

        int m = list.size();
        double median = 0.0;

        if(m % 2 == 0){
            median = (list.get(m/2) + list.get(m/2 - 1) ) / 2.0;
        }else{
            median = list.get(m/2);
        }

        return median;

    }
}
