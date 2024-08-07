class Solution {
    public ListNode reverseList(ListNode head) {
        // Node temp = head;
        // if(head.data == null){
        //     return head;
        // }

        ListNode prev = null;
        ListNode curr = head;
        ListNode next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
}