package com.skyhung.sort;

/**
 * @author zth
 * @date 2019/9/22 19:00
 */

import javax.swing.text.DefaultEditorKit;

/**
 * 直接插入排序
 * 时间复杂度为O(n^2)
 */
public class Straight_Insertion_Sort {
    public static void main(String[] args) {

        int[] x = {1,3,2,5,7,4,6,5};
        InsertSort_x(x);
        for(int i = 0;i<x.length;i++){
            System.out.println(x[i]);
        }
    }

    public static void InsertSort_x(int[] x){
        int temp;
        int j;
        int i;
        for (i = 1; i < x.length; i++) {

            temp = x[i];//待插入元素

            for (j = i; x[j-1] > temp && j >= 1; j--) {
                x[j] = x[j - 1];
            }
            x[j] = temp;

        }
    }
}
