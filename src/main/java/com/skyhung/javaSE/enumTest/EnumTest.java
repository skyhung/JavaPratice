package com.skyhung.javaSE.enumTest;

/**
 * @author zth
 * @date 2019/10/22 22:25
 */
public class EnumTest {
    public void judge(SeasonEnum s){
        switch (s){
            case spring:
                System.out.println("春");
                break;
            case summer:
                System.out.println("夏");
                break;
            case fall:
                System.out.println("秋");
                break;
            case winter:
                System.out.println("冬");
                break;
        }
    }

    public static void main(String[] args) {
        for(SeasonEnum s : SeasonEnum.values()){
            System.out.println(s);
        }
        new EnumTest().judge(SeasonEnum.spring);
        System.out.println(SeasonEnum.spring.compareTo(SeasonEnum.summer));//比较
        System.out.println(SeasonEnum.spring.ordinal());//返回索引值

        Gender g = Enum.valueOf(Gender.class,"female");
        g.info();

    }
}
