package leetcode.lc202103;

/*
7. Reverse Integer
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−2^31,  2^31 − 1].
 For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

 */

public class LC0007 {
    public int reverse(int x) {

        int result = 0;// 返回值
        while (x != 0) {
            if (Math.abs(result) > 214748364) {
                return 0;
            }
            result = result * 10 + (x % 10);// 求余,更新result
            x /= 10;// 求商,向下取整
        }
        return result;

    }
}
