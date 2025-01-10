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
    public ListNode[] splitListToParts(ListNode head, int k) {
        // calc the length 
        // calc the partLengths[] 
            // len/k .. 3/5 = > len < k -> each element and empty lists.. k count
            //          10/3 = > 3 .. reaminder.. 1 => 3+3 .. add remainder

            // keep an int[] of partLengths .. 
        ListNode[] result = new ListNode[k];
        // calc the length
        ListNode itr = head;
        int len = 0;
        while(itr != null ) {
            len++;
            itr = itr.next;
        }
        if(len < k) {
            // put each element in single list .. 
            // append empty list until partLengths not full
            itr = head;
            ListNode prev = null;
            int i = 0;
            while( itr != null ) {

                prev = itr;
                itr = itr.next;

                result[i] = prev;
                result[i].next = null;

                i++;
            }
            return result;
        }
        // calc the partLengths[] 
        int[] partLengths = new int[k];        
        int quo = len/k; int remainder = len%k;
        for(int i = 0; i < k; i++ ) {
            if (remainder != 0) {
                partLengths[i] = quo+1;
                remainder--;
            }
            else{
                partLengths[i] = quo;
            }
        }
        itr = head;
        int i = 0; 
        ListNode prev = null;
        while(itr != null && i < k) {
            int currListLen = partLengths[i];            
            result[i] = itr;
            while(currListLen != 0 && itr != null ) {
                prev = itr;
                itr = itr.next;
                currListLen--;                
            }
            if(prev != null ) {
                prev.next = null;
            }
            i++;
            
        }


        return result;

    }
}