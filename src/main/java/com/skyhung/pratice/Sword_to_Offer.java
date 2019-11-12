package com.skyhung.pratice;

import java.util.ArrayList;

/**
 * @author zth
 * @date 2019/10/8 14:20
 */

public class Sword_to_Offer {
    public static void main(String[] args) {
        replaceSpace(new StringBuffer("hello world"));
    }

    public static boolean Find(int target, int [][] array) {
        /**
         * 题目描述
         *
         * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
         * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
         */
        for(int i = 0 ; i<array.length ; i++){
            for(int j = 0 ; j<array[i].length;j++){
                if(array[i][j]==target){
                    return true;
                }
            }
        }
        return false;

    }

    public static String replaceSpace(StringBuffer str) {
        /**
         * 题目描述
         * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy
         */
        String str2 = str.toString().replaceAll(" ","%20");
       /*
        String[] s = str.toString().split(" ");
        for(int i = 0 ; i<s.length-1;i++){
            s[i] = s[i]+"%20";

        }
        String str2="";
        for(int j = 0 ; j<s.length;j++){
            str2 += s[j];
        }*/
        System.out.println(str2);
        return str2;
    }



}
