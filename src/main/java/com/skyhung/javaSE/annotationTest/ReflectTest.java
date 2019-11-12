package com.skyhung.javaSE.annotationTest;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author zth
 * @date 2019/10/27 23:08
 *
 * 框架类
 * 可用创建任意的对象，可用执行任意的方法
 */
@Pro(className = "com.skyhung.javaSE.annotationTest.Demo1",methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws Exception {

        //获取该类的字节码文件对象
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        //获取上边的注解对象
        Pro pro = reflectTestClass.getAnnotation(Pro.class);
        //调用注解中定义的抽象方法，获取返回值
        String className = pro.className();
        String methodName = pro.methodName();
        //System.out.println(className+methodName);


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
