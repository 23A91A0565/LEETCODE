class MyHashMap {
    int freq[];
    public MyHashMap() {
        freq=new int[1000001];
        Arrays.fill(freq,Integer.MIN_VALUE);
    }
    
    public void put(int key, int value) {
        freq[key]=value;
    }
    
    public int get(int key) {
        if(freq[key]==Integer.MIN_VALUE)return -1;
        return freq[key];
    }
    
    public void remove(int key) {
        freq[key]=Integer.MIN_VALUE;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */