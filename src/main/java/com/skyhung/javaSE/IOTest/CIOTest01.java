package com.skyhung.javaSE.IOTest;

import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * @author zth
 * @date 2019/10/26 17:30
 *
 * 使用commons-io jar包
 */
public class CIOTest01 {

    public static void main(String[] args) {
        long len = FileUtils.sizeOf(new File("src/main/java/com/skyhung/javaSE/IOTest/abc.txt"));
        System.out.println(len);
        len = FileUtils.sizeOf(new File("src/main"));
        System.out.println(len);

    }

}
