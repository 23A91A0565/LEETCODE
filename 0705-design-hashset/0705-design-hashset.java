class MyHashSet {
    boolean res[];
    public MyHashSet() {
        res=new boolean[1000001];
    }
    
    public void add(int key) {
        res[key]=true;
    }
    
    public void remove(int key) {
        res[key]=false;
    }
    
    public boolean contains(int key) {
        return res[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */