/*485. Max Consecutive Ones

Given a binary array `nums`, return *the maximum number of consecutive* `1`*'s in the array*
*/
class maxConsecutives {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int num=0;
        for(int i=0; i< nums.length; i++){
            if(nums[i]==1){
                num++;
                max=Math.max(num,max);
            }else{
                num=0;
            }
        }
     return max;
    }
}
