/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0)return null;
        while(lists.length>1){
            List<ListNode> temp=new ArrayList<>();
            for(int i=0;i<lists.length;i+=2){
                ListNode curr1=lists[i];
                ListNode curr2=(i+1<lists.length)?lists[i+1]:null;
                temp.add(merge(curr1,curr2));
            }
            lists=temp.toArray(new ListNode[0]);
        }
        return lists[0];
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                temp.next=l1;
                l1=l1.next;
            }
            else{
                temp.next=l2;
                l2=l2.next;
            }
            temp=temp.next;
        }
        temp.next=(l1!=null)?l1:l2;
        return dummy.next;
    }
}