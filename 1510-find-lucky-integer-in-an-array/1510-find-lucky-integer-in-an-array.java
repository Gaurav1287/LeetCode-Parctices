class Solution {
    public int findLucky(int[] arr) {
         Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            hm.put(num, hm.getOrDefault(num, 0) + 1); 
        }

        int ans = -1;

        for (int key : hm.keySet()) {
            if (hm.get(key) == key) {
                ans = Math.max(ans, key); 
            }
        }

        return ans;
        
    }
}