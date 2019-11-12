package com.skyhung.javaSE.DateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @author zth
 * @date 2019/10/24 20:50
 */
public class TestCalendar {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入日期：例如2019-2-13");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date date = sdf.parse(s);

        Calendar calendar = new GregorianCalendar();

        printDate(calendar,date);

    }
    public static void printDate(Calendar calendar,Date date){
        calendar.setTime(date);

        int day = calendar.get(Calendar.DATE);
        int maxDay = calendar.getActualMaximum(Calendar.DATE);
        calendar.set(Calendar.DAY_OF_MONTH,1);
        System.out.println("日\t一\t二\t三\t四\t五\t六\t");

        for(int i =0; i<maxDay;i++){
            if(calendar.get(Calendar.DAY_OF_MONTH)==1){
                int week = calendar.get(Calendar.DAY_OF_WEEK)-1;//0-6,0:星期日
                for(int j = 0; j<week;j++){
                    System.out.print("\t");
                }
            }

            if(calendar.get(Calendar.DAY_OF_MONTH)==day){
                System.out.print(calendar.get(Calendar.DAY_OF_MONTH)+"*"+"\t");
            }
            else {
                System.out.print(calendar.get(Calendar.DAY_OF_MONTH)+"\t");
            }

            calendar.add(Calendar.DAY_OF_MONTH,1);

            if(calendar.get(Calendar.DAY_OF_WEEK)-1==0){
                System.out.println("");
            }
        }
    }
}
