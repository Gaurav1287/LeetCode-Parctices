class NumberContainers {
     Map<Integer,TreeSet<Integer>>numtoindex;
     Map<Integer,Integer>indextonum;
    public NumberContainers() {
        numtoindex=new HashMap<>();
        indextonum=new HashMap<>();
    }
    
    public void change(int index, int number) {
        //old delete
        if(indextonum.containsKey(index))
        {
           int prev=indextonum.get(index);
           numtoindex.get(prev).remove(index);
           if(numtoindex.get(prev).size()==0)
           {
            numtoindex.remove(prev);
           }
        }
        // new insert
        indextonum.put(index,number);
        if(!numtoindex.containsKey(number))
        {
            numtoindex.put(number,new TreeSet<>());
        }
        numtoindex.get(number).add(index);
        
    }
    
    public int find(int number) {
        if(!numtoindex.containsKey(number))
        {
            return -1;
        }
        return numtoindex.get(number).first();
        
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */