package com.skyhung.javaSE.ThreadTest;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;

/**
 * @author zth
 * @date 2019/10/26 16:55
 *
 * 下载图片
 */
public class WebDownload {
    public void download(String url,String name)  {
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            System.out.println("下载失败");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}

class ThreadDownload extends Thread{
    private String url;
    private String name;
    public ThreadDownload(String url,String name){
        this.url = url;
        this.name = name;
    }
    @Override
    public void run() {
        WebDownload webDownload = new WebDownload();
        webDownload.download(url,name);
    }
}
