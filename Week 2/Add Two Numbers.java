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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        while(l1!=null && l2 != null)
        {
            int sum = carry + l1.val+ l2.val;
            ListNode next = new ListNode(sum % 10);
            curr.next = next;
            curr = curr.next;
            carry = sum/10;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null)
        {
            int sum = carry + l1.val;
            ListNode next = new ListNode(sum % 10);
            curr.next = next;
            curr = curr.next;
            carry = sum/10;
            l1 = l1.next;
        }
        while(l2 != null)
        {
            int sum = carry + l2.val;
            ListNode next = new ListNode(sum % 10);
            curr.next = next;
            curr = curr.next;
            carry = sum/10;
            l2 = l2.next;
        }
        if(carry > 0)
        {
            ListNode next = new ListNode(carry);
            curr.next = next;
        }
        return dummy.next;
    }
}