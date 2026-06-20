/***189. Rotate Array**
Given an integer array `nums`, rotate the array to the right by `k` steps, where `k` is non-negative.
*/

class rotateArray{
    public void rotate(int[] nums, int k) {
        // int n = nums.length;
        // int[] result =new int[n];
        // for (int i= 0;i<n;i++) {
        //     result[(i + k)%n]= nums[i];
        // }
        // for (int i=0;i<n;i++) {
        //     nums[i]=result[i];
        // }
        int n=nums.length;
        k%=n;
        
        reverse(nums,0,n - 1);  
        reverse(nums,0,k - 1);  
        reverse(nums,k,n - 1);  
    }
    
    private void reverse(int[] nums,int l,int r){
        while (l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
}
