package com.skyhung.javaSE.ThreadTest;

/**
 * @author zth
 * @date 2019/10/26 21:58
 * synchronized的使用
 */

public class SynTest {


    public static void main(String[] args) {
        Account account = new Account("结婚礼金",100);
        Drawing d1 = new Drawing(account,70);
        Drawing d2 = new Drawing(account,30);
        new Thread(d1,"d1").start();
        new Thread(d2,"d2").start();

    }
}

class Drawing implements Runnable{
    Account account;//取钱账户
    int drawingMoney;//取钱数
    int packetTotal;//口袋里的钱数

    public Drawing(Account account, int drawingMoney) {
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    @Override
    public void run() {
        drawMoney();
    }
    public void drawMoney(){
        if(account.getMoney()<=0) return;
        synchronized (account){
            if(this.account.getMoney()-drawingMoney<0){
                return;
            }
            //模拟网络延迟
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.setMoney(account.getMoney()-drawingMoney);
            packetTotal += drawingMoney;
            System.out.println(Thread.currentThread().getName()+"取钱,"+this.account.getName()+"账户余额为："+this.account.getMoney());
            System.out.println(Thread.currentThread().getName()+this.account.getName()+"口袋的钱为："+this.packetTotal);
        }

    }
}
class Account{
    private int money;
    private String name;
    public Account(String name,int money){
        this.name = name;
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}