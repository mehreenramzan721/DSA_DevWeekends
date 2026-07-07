/*2215. Find the Difference of Two Arrays
Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
Note that the integers in the lists may be returned in any order.
*/


class diffTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Map<Integer, Boolean> map1 = new HashMap<>();
        Map<Integer, Boolean> map2 = new HashMap<>();

        for (int n : nums1) map1.put(n, true);
        for (int n : nums2) map2.put(n, true);

        List<Integer> diff1 = new ArrayList<>();
        List<Integer> diff2 = new ArrayList<>();

        for (int key : map1.keySet()) {
            if (!map2.containsKey(key)) diff1.add(key);
        }
        for (int key : map2.keySet()) {
            if (!map1.containsKey(key)) diff2.add(key);
        }

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(diff1);
        answer.add(diff2);
        return answer;
    }
}
