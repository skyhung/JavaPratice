package com.skyhung.javaSE.InternetTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

/**
 * @author zth
 * @date 2019/10/26 0:56
 */
public class InternetTest01 {
    public static void main(String[] args) throws Exception {

    }
    public static void udpTest(){

    }

    public static void urlTest() throws Exception {
        URL url = new URL("https://www.jd.com");
        InputStream is = url.openStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is,"UTF-8"));

        String msg = null;
        while ((msg=bufferedReader.readLine())!=null){
            System.out.println(msg);
        }
        bufferedReader.close();
    }
}
