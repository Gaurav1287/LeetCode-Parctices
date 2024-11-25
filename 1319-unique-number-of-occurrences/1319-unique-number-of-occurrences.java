class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> sh=new HashMap<>();
        for(int num:arr)
        {
         sh.put(num,sh.getOrDefault(num,0)+1);
        }
       Set<Integer> frequencySet = new HashSet<>();
        for (int frequency : sh.values()) {
            if (!frequencySet.add(frequency)) {
                return false; // Duplicate frequency found
            }
        }
        return true;


    }
}