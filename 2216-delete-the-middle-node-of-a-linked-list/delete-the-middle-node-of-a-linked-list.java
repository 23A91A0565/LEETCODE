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
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c+=1;
            temp=temp.next;
        }
        int mid=c/2;
        temp = head;
        for (int i = 0; i < mid - 1; i++) {
            temp = temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}