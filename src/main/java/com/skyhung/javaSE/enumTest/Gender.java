package com.skyhung.javaSE.enumTest;

/**
 * @author zth
 * @date 2019/10/22 22:35
 */
public enum Gender implements IGenderDesc{
    male("男"){
        @Override
        public void info() {
            System.out.println("这个枚举值代表男性");
        }
    },female("女"){
        @Override
        public void info() {
            System.out.println("这个枚举值代表女性");
        }
    };
    private final String name;
    private Gender (String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
