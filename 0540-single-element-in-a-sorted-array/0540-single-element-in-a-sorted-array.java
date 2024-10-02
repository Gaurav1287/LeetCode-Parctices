class Solution {
    public int singleNonDuplicate(int[] nums) {
    HashSet<Integer> hashSet = new HashSet<>();

        for (int num : nums) {
            if (hashSet.contains(num)) {
                hashSet.remove(num);
            } else {
                hashSet.add(num);
            }
        }

        // The set should have only one element, which is the unique one
        return hashSet.iterator().next();
    }
}