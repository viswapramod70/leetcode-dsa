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
        if(head == null || head.next == null)
            return ;
        ListNode mid = getMid(head);
        ListNode second = reverse(mid.next);
        mid.next = null;
        ListNode first = head;
        while(second!=null){
          ListNode temp1 = first.next;
          ListNode temp2 = second.next;
          first.next = second;
          second.next = temp1;

          first = temp1;
          second = temp2;
        }
       head = first;
    }
    public ListNode getMid(ListNode head){
        if(head.next == null || head == null)
            return head;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null ){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null)
            return head;
        ListNode previous = null;
        ListNode present = head;
        ListNode next = present.next;
        while(present!=null){
            present.next = previous;
            previous = present;
            present = next;
            if(next!=null)
                next = next.next;
        }
        return previous;
    }
}
// class Solution {
//     public void reorderList(ListNode head) {
//         if (head == null || head.next == null) return;

//         // Step 1: Find the middle
//         ListNode slow = head, fast = head;
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }

//         // Step 2: Reverse the second half
//         ListNode second = reverse(slow.next);
//         slow.next = null; // Cut the list into two halves

//         // Step 3: Merge the two halves
//         ListNode first = head;
//         while (second != null) {
//             ListNode temp1 = first.next;
//             ListNode temp2 = second.next;

//             first.next = second;
//             second.next = temp1;

//             first = temp1;
//             second = temp2;
//         }
//     }

//     private ListNode reverse(ListNode head) {
//         ListNode prev = null;
//         while (head != null) {
//             ListNode nextTemp = head.next;
//             head.next = prev;
//             prev = head;
//             head = nextTemp;
//         }
//         return prev;
//     }
// }