/*
1512. Number of Good Pairs
Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.
*/

class numIdenticalPairs {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int goodPairs = 0;
        
        for (int num : nums) {
            if (countMap.containsKey(num)) {
                goodPairs += countMap.get(num); 
            }
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        return goodPairs;
    }
}
