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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        int c=0;
        ListNode temp=head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        temp=head;
        c=c/2-1;
        while(c-->0){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
        
    }
}