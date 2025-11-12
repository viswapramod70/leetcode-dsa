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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left,right);
    }
    public ListNode merge(ListNode first,ListNode second){
        ListNode n = new ListNode();
        ListNode tail = n;
        while(first!=null && second!=null){
            if(first.val<=second.val){
                tail.next = first;
                first = first.next;
                tail = tail.next;
            }
            else{
                tail.next = second;
                second = second.next;
                tail = tail.next;
            }
        } 
        tail.next =(first!=null)?first:second;
        return n.next;
    }
    public ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while(head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
}