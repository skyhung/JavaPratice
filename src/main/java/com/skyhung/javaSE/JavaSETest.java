package com.skyhung.javaSE;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author zth
 * @date 2019/10/22 22:22
 */
public class JavaSETest {
    public static void main(String[] args) {
        List<String> alist = new ArrayList<>();
        alist.add("aa");
        alist.add("bb");
        alist.add("ccc");

        for(Iterator<String> iterator = alist.iterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }
        Collections.sort(alist);
    }
}
