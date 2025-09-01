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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> ans=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            ans.push(temp.val);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null && temp.val==ans.pop()){
            temp=temp.next;
        }
        return temp==null;
    }
}