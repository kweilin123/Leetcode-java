package leetcode.lc202103;

import java.util.*;

/*
20. Valid Parentheses
Easy

7024

292

Add to List

Share
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
Example 4:

Input: s = "([)]"
Output: false
Example 5:

Input: s = "{[]}"
Output: true


Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */

/*
solution deque/stack
 */

public class LC0020 {

    public boolean isValid(String s) {
        String leftStr = "([{";
        String rightStr = ")]}";
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (leftStr.indexOf(c) != -1) {
                stack.push(c);
            } else if (stack.isEmpty() || rightStr.indexOf(c) != leftStr.indexOf(stack.pop())) {
                return false;
            }
        }
        if (stack.isEmpty())
            return true;
        else return false;
    }
}
