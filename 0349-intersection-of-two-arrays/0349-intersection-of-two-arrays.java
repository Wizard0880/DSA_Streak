class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;

        HashSet<Integer> set = new HashSet<>();

        while( i < n && j < m){
            if(nums1[i] == nums2[j]){
                set.add(nums2[j]);
                i++;
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }

        int p[] = new int[set.size()];
        int k = 0;
        for(int num : set){
            p[k] = num;
            k++;
        }
        return p;
    }
}