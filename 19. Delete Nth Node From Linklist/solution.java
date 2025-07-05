public class solution {
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
    
            int count = 0;
            ListNode temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
    
            if (n == count) {
                return head.next;
            }
    
            temp = head;
            for (int i = 1; i < count - n; i++) {
                temp = temp.next;
            }
    
            temp.next = temp.next.next;
    
            return head;
        }
    }
    
}
