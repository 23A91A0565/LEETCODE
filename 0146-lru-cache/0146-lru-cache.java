class LRUCache {
    class Node{
        int key;
        int value;
        Node prev;
        Node next;
        Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    Node head;
    Node tail;
    HashMap<Integer,Node> ans;
    int capacity;

    public LRUCache(int capacity) {
        ans=new HashMap<>();
        this.capacity=capacity;
        head=new Node(0,0);
        tail=new Node(0,0);

        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(!ans.containsKey(key)){
            return -1;
        }
        Node temp=ans.get(key);
        delete(temp);
        insertAtEnd(temp);

        return temp.value;
    }
    
    public void put(int key, int value) {
        if(ans.containsKey(key)){
            Node temp=ans.get(key);
            delete(temp);

            temp.value=value;
            ans.put(key,temp);

            insertAtEnd(temp);
        }
        else{
            Node s=new Node(key,value);
            ans.put(key,s);
            insertAtEnd(s);

            if(ans.size()>capacity){
                Node rem=head.next;
                ans.remove(rem.key);
                delete(rem);
            }
        }
    }
    public void delete(Node curr){
        curr.prev.next=curr.next;
        curr.next.prev=curr.prev;
    }
    public void insertAtEnd(Node curr){
        Node last=tail.prev;
        last.next=curr;
        curr.prev=last;

        curr.next=tail;
        tail.prev=curr;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */