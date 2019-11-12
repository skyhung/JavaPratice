package com.skyhung.sort;

/**冒泡排序,一趟关键字最大的记录在最后
 * @author zth
 * @date 2019/10/12 19:54
 */
public class Bubble_Sort {
    public static void main(String[] args) {

        int[] x = {1,3,2,5,7,4,6,5};
        BubbleSort_x2(x);
        for(int i = 0;i<x.length;i++){
            System.out.println(x[i]);
        }
    }
    public static void BubbleSort_x(int[] x){
        for(int j = x.length;j>=2;j--){
            int i = 1;
            while(i<j){
                if(x[i-1]>x[i]){
                    int temp = x[i-1];
                    x[i-1] = x[i];
                    x[i] = temp;
                }
                i++;
            }
        }

    }
    public static void BubbleSort_x2(int[] x){
        for(int i = x.length;i>1;i--){
            for(int j =0;j<i-1;j++){
                if(x[j]>x[j+1]){
                    int temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                }
            }
        }

    }

}
