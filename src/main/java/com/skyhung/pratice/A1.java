package com.skyhung.pratice;
import java.util.ArrayList;

/**
 * @author zth
 * @date 2019/9/22 19:34
 */


/**
 * 根据空格反转字符串
 */
public class A1 {
    public static void test(String s){
        ArrayList<String> a = new ArrayList<String>();
        int k = 0;
        int j = 0;
        for(int i = 0;i<s.length();i++){
            if((s.charAt(i)+"").equals(" ")){

                a.add(s.substring(j,i));
                j = i+1;

            }

        }
        a.add(s.substring(j,s.length()-1));
        for(int x = a.size();x>0;x--){
            System.out.print(a.get(x-1)+" ");
        }
    }
    public static void main(String[] args){
        test("It's a dog!");
    }
}