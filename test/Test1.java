import com.sun.istack.internal.NotNull;
import org.junit.Test;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zth
 * @date 2019/10/19 22:40
 */
//查询出字符串B中与字符串A中相同的字符
public class Test1 {
    public static void main(String[] args) {
        String a ="abcdrg41dfaaadd";
        String b ="addscfsij5";
        ArrayList<String> list=aEqaulsb(a,b);
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        //方法二：正则表达式
        /*Matcher m =Pattern.compile("["+b+"]").matcher(a);
        ArrayList<String> list = new ArrayList<String>();
        while(m.find()){
            list.add(m.group());

        }
        System.out.println("原：");
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("现：");
        ArrayList<String> list2 = deleteSameChar(list);
        for(int i=0; i<list2.size();i++){
            System.out.println(list.get(i));
        }*/
    }
    public static ArrayList<String> deleteSameChar(ArrayList<String> list){
        for(int i = 0; i<list.size()-1;i++){

            for(int j = i+1;j<list.size();j++){
                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                    j=j-1;
                }
            }

        }
        return list;
    }

    public static ArrayList<String> aEqaulsb( String a, String b){
        ArrayList<String> list = new ArrayList<>();
        for(int i =0;i<a.length();i++){
            for(int j =0;j<b.length();j++){
                if(a.charAt(i)==b.charAt(j)&&!list.contains(String.valueOf(a.charAt(i)))){
                    list.add(String.valueOf(a.charAt(i)));
                }
            }

        }
        return list;
    }
}
