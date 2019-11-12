package com.skyhung.sort;

import java.util.ArrayList;

/**希尔排序
 * 将待排序列分割成若干个子序列分别进行直接插入排序。待整个序列基本有序时，再对全体记录进行一次直接插入排序
 * @author zth
 * @date 2019/9/22 19:34
 */
public class Shell_Sort {
    public static void test(int[] x) {
        //gap为步长
        for(int gap=x.length/2; gap>0; gap/=2) { /*步长逐渐减小*/
            //i=[0,gap)作为已排序的一个元素，后面的元素用直接插入排序。
            for(int i=gap;i<x.length;i++){
                    //插入排序
                    int temp = x[i];//待排元素
                    int j;
                    for(j=i;j>=gap&&x[j-gap]>temp;j-=gap){
                        x[j] = x[j-gap];//比插入元素大，前移一格
                    }
                    x[j] = temp;//插入合适位置
            }

            /*for(int i=gap; i<x.length; i++) { *//*在同一步长内*//*
                //同一步长内排序方式是插入排序
                int temp = x[i];//待排元素
                int j;
                //j-gap代表有序数组中最大数的下标，j-pag表示有序数组的前一个元素，减pag是减去偏移量就是步长
                for(j=i; j>=gap && temp<x[j-gap]; j-=gap)
                    x[j] = x[j-gap]; //原有序数组最大的后移一位
                x[j] = temp; //找到了合适的位置插入
            }*/
        }


    }

    public static void main(String[] args){
        int[] x = {1,5,3,2,5,7,4,6,5,7};
        test(x);
        for(int i = 0;i<x.length;i++){
            System.out.println(x[i]);
        }
    }
}
