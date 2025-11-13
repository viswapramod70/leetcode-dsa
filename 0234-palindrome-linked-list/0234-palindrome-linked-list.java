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
        if(head.next == null || head == null)
            return true;

        ListNode second = getMid(head);
        ListNode rev = reverse(second);
        while(head!=null && rev!=null){
            if(head.val!=rev.val){
                return false;
            }
            head = head.next;
            rev = rev.next;
        }
        return true;
    }
    public ListNode getMid(ListNode head){
        ListNode midPrev = null;
        while(head!=null && head.next!=null){
            midPrev = (midPrev == null)?head:midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
    public ListNode reverse(ListNode head){
        ListNode previous = null;
        ListNode present = head;
        ListNode next = present.next;
        while(present!=null){
            present.next = previous;
            previous = present;
            present = next;
            if(next!= null){
                next = next.next;
            }
        }
        return previous;
    }
}