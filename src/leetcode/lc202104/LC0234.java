package leetcode.lc202104;


/*
234. Palindrome Linked List
https://leetcode.com/problems/palindrome-linked-list/
 */
public class LC0234 {

    ListNode ref;
    public boolean isPalindrome(ListNode head) {
        ref = head;
        return check(head);
    }
    public boolean check(ListNode node) {
        if (node == null) return true;
        boolean ans = check(node.next);
        boolean isEqual = (ref.val == node.val) ? true : false;
        ref = ref.next;
        return ans && isEqual;
    }
}
