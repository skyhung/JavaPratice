package com.skyhung.javaSE.reflectTest;

import com.skyhung.javaSE.annotationTest.Pro;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author zth
 * @date 2019/10/27 23:08
 *
 * 框架类
 * 可用创建任意的对象，可用执行任意的方法
 */

public class ReflectTest {
    public static void main(String[] args) throws Exception {

        //加载配置文件
        Properties properties = new Properties();
        //获得当前的类加载器
        ClassLoader classLoader = com.skyhung.javaSE.annotationTest.ReflectTest.class.getClassLoader();
        //通过类加载器获得class目录的配置文件
        InputStream is = classLoader.getResourceAsStream("pro.properties");


        properties.load(is);


        //获取配置文件的数据
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");


        //加载类进内存
        Class cls = Class.forName(className);
        //创建对象
        Object object = cls.newInstance();
        //获取对象方法
        Method method = cls.getMethod(methodName);
        //执行方法
        method.invoke(object);
    }
}
