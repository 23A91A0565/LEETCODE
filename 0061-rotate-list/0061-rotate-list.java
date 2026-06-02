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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)return head;
        int n=0;
        ListNode t=head;
        while(t!=null){
            n+=1;
            t=t.next;
        }
        k=k%n;
        while(k-->0){
            ListNode prev=null;
            ListNode temp=head;
            while(temp.next!=null){
                prev=temp;
                temp=temp.next;
            }
            int dat=temp.val;
            prev.next=null;
            ListNode curr=new ListNode(dat);
            curr.next=head;
            head=curr;
        }
        return head;
    }
}