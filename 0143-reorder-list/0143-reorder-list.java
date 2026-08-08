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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)return;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode reverse=slow.next;
        slow.next=null;
        ListNode prev=null;
        ListNode curr=reverse;
        ListNode nxt=reverse;
        while(curr!=null){
            nxt=nxt.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        reverse=prev;

        ListNode first=head;
        ListNode second=reverse;
        while(second!=null){
            ListNode firstNext=first.next;
            ListNode secNext=second.next;

            first.next=second;
            second.next=firstNext;
            
            first=firstNext;
            second=secNext;

        }
    }
}