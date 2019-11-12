package com.skyhung.sort;

/**
 * @author zth
 * @date 2019/10/12 20:04
 */
public class Qucick_Sort {
    public static void main(String[] args) {

        int[] x1 = {4,1,3,2,5,7,4,6,5};
        QuickSort_x(x1,0,x1.length-1);
        System.out.println("一趟快速排序为：");
        for(int i = 0;i<x1.length;i++){
            System.out.println(x1[i]);
        }
        int[] x2 = {4,1,3,2,5,7,4,6,5};
        QSort(x2,0,x2.length-1);
        System.out.println("快速排序为：");
        for(int i = 0;i<x2.length;i++){
            System.out.println(x2[i]);
        }
    }
    //一趟快速排序
    public static int QuickSort_x(int[] x,int low , int high){
        int pivotkey = x[low];
        while(low<high){
            while(low<high && x[high]>=pivotkey){high--;}//从表后端往前扫描
            x[low] = x[high];//后端小于pivotkey的值前移
            //x[high] = pivotkey;
            while(low<high && x[low]<=pivotkey){low++;}//从表前端往后扫描
            x[high] = x[low];//前端大于pivotkey的值后移

        }
        x[low] = pivotkey;
        return low;//返回pivotkey的位置

    }
    //递归形式快速排序
    public static void QSort(int[] x,int low,int high){
        if(low<high){
            int pivotloc =QuickSort_x(x,low,high);//一趟快排后privotkey的位置
            QSort(x,low,pivotloc-1);//在privotkey左边的子表递归
            QSort(x,pivotloc+1,high);//在privotkey右边的子表递归
        }
    }
}
