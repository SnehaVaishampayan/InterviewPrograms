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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) {
            return null;
        }
        if(list1 == null) {
            return list2;
        }
        if(list2 == null) {
            return list1;
        }
         ListNode resHead = null;
        if(list1.val < list2.val ) {
            resHead = list1;
            list1 = list1.next;
        }
        else {
            resHead = list2;
            list2 = list2.next;          
        }

        
        ListNode currNode = resHead;
        while(list1 != null && list2 != null ){
            if(list1.val < list2.val) {
                currNode.next = list1;
                list1 = list1.next;
            }
            else {
                currNode.next = list2;
                list2 = list2.next;
            }
            currNode = currNode.next;
        }
        System.out.println("cc " + currNode.val);

        while(list1 != null) {
            currNode.next = list1;
            list1 = list1.next;
            currNode = currNode.next;
        }
        while(list2 != null) {
            currNode.next = list2;
            list2 = list2.next;
            currNode = currNode.next;
        }
        return resHead;
    }
}