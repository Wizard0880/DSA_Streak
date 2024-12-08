class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        fun(nums,0,n - 1);
    }
    public void fun(int nums[],int si,int ei){

        int mid = si + (ei - si) / 2;
        if(si >= ei){
            return;
        }

        fun(nums,si,mid);
        fun(nums,mid+1,ei);
        result(nums,si,mid,ei);
    }

    public void result(int nums[],int si,int mid,int ei){
        int arr[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= ei){
            if(nums[i] < nums[j]){
                arr[k] = nums[i];
                i++;
            }else{
                arr[k] = nums[j];
                j++;
            }
            k++;
        }

        while(i <= mid){
            arr[k++] = nums[i++];
        }
        while(j <= ei){
            arr[k++] = nums[j++];
        }
        for ( k = 0; k < arr.length; k++) {
            nums[si + k] = arr[k];
        }
    }
    
}