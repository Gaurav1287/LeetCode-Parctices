class RandomizedSet {
    private List<Integer> list; 
    private Map<Integer, Integer> map; 
    private Random random;

    public RandomizedSet() {
         list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
        
    }
    
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false; 
        }
        map.put(val, list.size()); 
        list.add(val); 
        return true;
        
    }
    
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false; 
        }
        int index = map.get(val);
        int lastValue = list.get(list.size() - 1);
        list.set(index, lastValue);
        map.put(lastValue, index);
        list.remove(list.size() - 1);
        map.remove(val); 
        return true;
        
    }
    
    public int getRandom() {
        int randomIndex = random.nextInt(list.size()); 
        return list.get(randomIndex);
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */