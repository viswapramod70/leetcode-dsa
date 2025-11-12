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
    public ListNode mergeTwoLists(ListNode node1, ListNode node2) {
       
        ListNode node3 = new ListNode();
        ListNode tail = node3;
         if(node1 == null || node2 == null){
            if(node1==null && node2==null)
                return node1;
            if(node1 == null)
                return node2;
            return node1;
        }
        while(node1 != null && node2 != null){
            if(node1.val <= node2.val){
                tail.next = node1;
                node1 = node1.next;
                tail = tail.next;
            }
            else if(node2.val<=node1.val){
               
                tail.next = node2;
                node2 = node2.next;
                tail = tail.next;
            }
        }
        tail.next =(node1!=null)?node1:node2;
        return node3.next;
    }
}