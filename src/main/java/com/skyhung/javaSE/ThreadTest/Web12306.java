package com.skyhung.javaSE.ThreadTest;

/**
 * @author zth
 * @date 2019/10/26 20:10
 */
public class Web12306 implements Runnable{
    private static int tickets=99;
    @Override
    public void run() {
        while (true){
            if(tickets<0) break;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":"+tickets--);

        }

    }

    public static void main(String[] args) {
        Web12306 web12306 = new Web12306();
        new Thread(web12306,"aaa").start();
        new Thread(web12306,"bbb").start();
        new Thread(web12306,"ccc").start();
    }
}
