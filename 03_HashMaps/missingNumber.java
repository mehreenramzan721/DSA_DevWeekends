/*
268. Missing Number
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
*/
class missingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Boolean> numMap = new HashMap<>();
        for (int num : nums) {
            numMap.put(num, true);
        }
        for (int i = 0; i <= n; i++) {
            if (!numMap.containsKey(i)) {
                return i;
            }
        }
        
        return -1;
    }
