class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        HashSet<Integer> Arr1Set = new HashSet<>();
        HashSet<Integer> Arr2Set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Arr1Set.add(nums1[i]);
        }

        for(int i = 0; i < m; i++){
            if(Arr1Set.contains(nums2[i])){
                Arr2Set.add(nums2[i]);
            }
        }
        
        int p = Arr2Set.size();
        int arr[] = new int[p];

        for(int i = 0; i < p; i++){
         arr[i] = (int) Arr2Set.toArray()[i];
        }
        return arr;
    }
}