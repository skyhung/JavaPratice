package com.skyhung.javaSE.ThreadTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zth
 * @date 2019/10/27 15:30
 */
public class SynCinema {
    public static void main(String[] args) {
        ArrayList<Integer> cinemaList = new ArrayList<>();
        for(int i = 0; i<20; i++){
            cinemaList.add(i);
        }

        Cinema cinema = new Cinema(cinemaList,"HappyCinema");
        Customer c1 = new Customer(cinema,Arrays.asList(1,2,4,5));
        Customer c2 = new Customer(cinema,Arrays.asList(3,7,8,5));
        new Thread(c1,"c1").start();
        new Thread(c2,"c2").start();
    }
}

class Customer implements Runnable{
    private Cinema cinema;
    private List<Integer> seats;


    public Customer(Cinema cinema, List<Integer> seats) {
        this.cinema = cinema;
        this.seats = seats;
    }

    @Override
    public void run() {
        synchronized (cinema){
            boolean flag = cinema.buyTickets(seats);
            if(flag){
                System.out.println("出票成功"+Thread.currentThread().getName()+"购买位置为"+seats.toString());

            }
            else {
                System.out.println("出票失败"+Thread.currentThread().getName()+"位置不足");
            }
            System.out.println("剩余可用位置为："+cinema.getAvailabelSeat().toString());
        }

    }
}
class Cinema {
    private ArrayList<Integer> availabelSeat;
    private String name;

    public ArrayList<Integer> getAvailabelSeat() {
        return availabelSeat;
    }

    public void setAvailabelSeat(ArrayList<Integer> availabelSeat) {
        this.availabelSeat = availabelSeat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cinema(ArrayList<Integer> availabelSeat, String name) {
        this.availabelSeat = availabelSeat;
        this.name = name;
    }

    public boolean buyTickets(List<Integer> tickets){
        System.out.println("欢迎购票，可用位置为："+availabelSeat.toString());
        ArrayList<Integer> temp = (ArrayList<Integer>) availabelSeat.clone();
        temp.removeAll(tickets);

        if(availabelSeat.size()-temp.size() != tickets.size())return false;

        availabelSeat = temp;
        return true;
    }


}
