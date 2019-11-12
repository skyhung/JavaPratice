package com.skyhung.sort;

/**选择排序。每一趟选取最小的记录
 * @author zth
 * @date 2019/10/12 21:09
 */
public class Selection_Sort {
    public static void main(String[] args) {

        int[] x = {1,3,2,5,7,4,6,5};
        SelectionSort_x(x);
        for(int i = 0;i<x.length;i++){
            System.out.println(x[i]);
        }
    }
    public static void SelectionSort_x(int[] x){
        for(int i = 0;i<x.length-1;i++){
            int index = i;
            //一趟选择排序
            //找出最小元素下标
            for(int j =i+1;j<x.length;j++){
                if(x[index]>x[j]){
                    index = j;
                }
            }
            //交换位置
            int tmp = x[index];
            x[index] = x[i];
            x[i] = tmp;

        }



    }
}
