class LRUCache {

   int cap;
   LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
    public LRUCache(int capacity) {
        cap=capacity;
    }
    
    public int get(int key) {
        if(!map.containsKey(key))
        return -1;
        int v=map.remove(key);
        map.put(key,v);
        return v;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
        map.remove(key);
        map.put(key,value);
        if(map.size()>cap)
        map.remove(map.keySet().iterator().next());
    }
}
