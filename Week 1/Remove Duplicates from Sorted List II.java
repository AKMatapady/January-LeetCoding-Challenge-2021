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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return head;
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        ListNode curr = head;
        ListNode sor = dummy;
        int count = 1;
        while(curr != null && curr.next != null)
        {
            while(curr.next != null && curr.val == curr.next.val)
            {
                count++;
                curr = curr.next;
            }
            //System.out.println(curr.val + " " + sor.val);
            if(count < 2)
            {
                sor.next = curr;
                sor = sor.next;
            }
            count = 1;
            curr = curr.next;
        }
        if(count < 2)
        {
            sor.next = curr;
            sor = sor.next;
        }
        if(sor != null)
            sor.next = null;
        return dummy.next;
    }
}