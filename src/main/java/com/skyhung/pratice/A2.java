package com.skyhung.pratice;

/**
 * @author zth
 * @date 2019/10/6 19:55
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 牛牛举办了一场数字游戏,有n个玩家参加这个游戏,游戏开始每个玩家选定一个数,然后将这个数写在纸上(十进制数,无前缀零),
 * 然后接下来对于每一个数字将其数位按照非递减顺序排列,得到新的数,新数的前缀零将被忽略。得到最大数字的玩家赢得这个游戏。
 *
 * 输入描述:
 * 输入包括两行,第一行包括一个整数n(1 ≤ n ≤ 50),即玩家的人数
 * 第二行n个整数x[i](0 ≤ x[i] ≤ 100000),即每个玩家写下的整数。
 *
 * 输出描述:
 * 输出一个整数,表示赢得游戏的那个玩家获得的最大数字是多少。
 *
 * 输入例子1:
 * 3
 * 9638 8210 331
 *
 * 输出例子1:
 * 3689
 */
public class A2 {
    public static void test(int players, Integer[] x){
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0 ; i<players ; i++){
            List<Integer> a = new ArrayList<Integer>();
            for(int j = 0 ; j<x[i].toString().length() ; j++){
                a.add(Integer.parseInt(x[i].toString().substring(j,j+1)));
            }
            Collections.sort(a);

            while(a.get(0)==0){
                if(a.size()==1){
                    break;
                }
                a.remove(0);

            }
            String sum ="";
            for (int k = 0; k < a.size(); k++) {
                sum = sum+a.get(k);
            }
            list.add(Integer.parseInt(sum));
        }

        Collections.sort(list);
        System.out.println(list.get(players-1)+"");
    }
    public static void main(String[] args){
        Integer[] x = {11,5,110,100001,0};
        test(5,x);

    }

}
