/*
1. Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
*/
class twoSum {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer , Integer> mp= new HashMap<> ( );
        for( int i=0; i< nums.length ; i++){
            int found = target - nums[i] ;
            if(mp.containsKey(found) ){
                return new int[]{ mp.get(found), i };
            }
            mp.put( nums[i], i);
        }
        return new int[] {};
    }
}
