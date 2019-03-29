package com.leetcode;

/**
 * @Auther: Administrator
 * @Date: 2019-03-26 16:50
 * @Description:
 * 对于一个 正整数，如果它和除了它自身以外的所有正因子之和相等，我们称它为“完美数”。
 *
 * 给定一个 正整数 n， 如果他是完美数，返回 True，否则返回 False
 *
 * 示例：
 * 输入: 28
 * 输出: True
 * 解释: 28 = 1 + 2 + 4 + 7 + 14
 */
public class CheckPerfectNumber {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(2));
    }

    public static boolean checkPerfectNumber(int num) {
        if(num<=1)//这里1感觉应该是完美数啊 但是LeetCode给的不是
            return false;
        int sum = 1;
        for(int i=2;i*i<num;i++){
            if(num%i==0){
                sum += i + num/i;
            }
        }
        return sum==num;
    }
}
