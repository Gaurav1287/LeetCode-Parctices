class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        
        // Find unique elements in each set
        List<Integer> uniqueToNums1 = new ArrayList<>(set1);
        uniqueToNums1.removeAll(set2);
        
        List<Integer> uniqueToNums2 = new ArrayList<>(set2);
        uniqueToNums2.removeAll(set1);
        
        // Prepare result
        List<List<Integer>> result = new ArrayList<>();
        result.add(uniqueToNums1);
        result.add(uniqueToNums2);
        
        return result;
       
    }
}