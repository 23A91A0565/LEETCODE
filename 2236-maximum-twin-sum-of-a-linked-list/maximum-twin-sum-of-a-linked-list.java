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
    public int pairSum(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            if(fast==null) break;
            slow=slow.next;
        }
        ListNode tempHead=slow.next;
        ListNode newtempHead = reverse(tempHead);
        int maxSum=0;
        while(newtempHead!=null){
            maxSum=Math.max(maxSum,newtempHead.val+head.val);
            head=head.next;
            newtempHead=newtempHead.next;
        }
        return maxSum;
    }
    ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}









 /*
class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer> ans=new ArrayList<>();
        while(head!=null){
            ans.add(head.val);
            head=head.next;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ans.size()/2;i++){
            int val=ans.get(i)+ans.get(ans.size()-i-1);
            max=Math.max(val,max);
        }
        return max;
    }
}
*/