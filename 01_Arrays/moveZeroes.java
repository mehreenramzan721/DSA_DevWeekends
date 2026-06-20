/*283. Move Zeroes
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
*/
class moveZeroes {
    public void moveZeroes(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length-1;j++){
        //         if(nums[j]==0){
        //         int temp=nums[j];
        //         nums[j]=nums[j+1];
        //         nums[j+1]=temp;
        //         }
        //     }
        // }

        //Another approach using two pointers
        int nonzero=0;
        for(int i=0;i<nums.length; i++){
            if(nums[i]!=0){
                if (i != nonzero){ // add this line to get the most optimal approach
                    nums[nonzero]=nums[i];
                }
                nonzero++;
            }
        }
        while(nonzero<nums.length){
            nums[nonzero]=0;
            nonzero++;
        }
    }
}
