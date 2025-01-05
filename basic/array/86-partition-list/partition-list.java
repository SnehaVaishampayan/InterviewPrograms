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
    public ListNode partition(ListNode head, int x) {

        // smaller equal greater
        ListNode smallHead = new ListNode(0);
        ListNode smallItr = smallHead;

        ListNode equalGreaterHead = new ListNode(0);
        ListNode equalGreaterItr = equalGreaterHead;

        ListNode curr = head;

        while(curr != null) {
            if(curr.val < x) {
                smallItr.next = curr;
                smallItr = smallItr.next;
            }
            else {
                equalGreaterItr.next = curr;
                equalGreaterItr = equalGreaterItr.next;
            }
            curr = curr.next;
        }
        equalGreaterItr.next = null;
        smallItr.next = equalGreaterHead.next;
        return smallHead.next;
    }
}