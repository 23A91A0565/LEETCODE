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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> ans=new ArrayList<>();
        ListNode temp=head;
        ListNode prev=temp;
        ListNode curr=prev.next;
        ListNode nxt=curr.next;
        int i=1;
        while(nxt!=null){
            if((prev.val<curr.val && nxt.val<curr.val) ||
                (prev.val>curr.val && nxt.val>curr.val)){
                    ans.add(i);
            }
            i++;
            prev=prev.next;
            curr=curr.next;
            nxt=nxt.next;
        }
        if(ans.size()<2){
            return new int[]{-1,-1};
        }
        int min=ans.get(1)-ans.get(0);
        for(int j=1;j<ans.size()-1;j++){
            min=Math.min(min,ans.get(j+1)-ans.get(j));
        }
        return new int[]{min,ans.get(ans.size()-1)-ans.get(0)};
    }
}