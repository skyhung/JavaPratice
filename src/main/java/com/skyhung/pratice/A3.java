package com.skyhung.pratice;

/**
 * @author zth
 * @date 2019/10/6 21:48
 */

/**
 * 字符串旋转:
 * 给定两字符串A和B，如果能将A从中间某个位置分割为左右两部分字符串（都不为空串），并将左边的字符串移动到右边字符串后面组成新的字符串可以变为字符串B时返回true。
 * 例如：如果A=‘youzan’，B=‘zanyou’，A按‘you’‘zan’切割换位后得到‘zanyou’和B相同返回true。
 *
 * 输入描述:
 * 2个不为空的字符串(说明:输入一个字符串以英文分号";"分割为2个字符串)
 * 例如:youzan;zanyou 即为A=‘youzan’，B=‘zanyou’
 *
 * 输出描述:
 * 输出true或false(表示是否能按要求匹配两个字符串)
 *
 * 输入例子1:
 * youzan;zanyou
 *
 * 输出例子1:
 * true
 *
 * 输入例子2:
 * youzan;zyouan
 *
 * 输出例子2:
 * false
 */
public class A3 {
    public static Boolean test(String s){
        String[] strings = s.split(";");
        String A = strings[0];
        String B = strings[1];
        for(int i = 1;i<A.length();i++){
            String a1 = A.substring(0,i);
            String a2 = A.substring(i);
            String newA = a2+a1;
            if(newA.equals(B)){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {

        if(test("youzan;zyouan")){
            System.out.println("success");
        }
        else System.out.println("false");
    }
}
