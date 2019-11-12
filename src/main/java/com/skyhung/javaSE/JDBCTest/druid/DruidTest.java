package com.skyhung.javaSE.JDBCTest.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.skyhung.javaSE.JDBCTest.utils.JDBCUtils;

import javax.sql.DataSource;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author zth
 * @date 2019/11/1 16:14
 */
public class DruidTest {
    public static void main(String[] args) throws Exception {
        //1. 创建Properties集合类。
        Properties pro = new Properties();

        //获取src路径下的文件的方式--->ClassLoader 类加载器
        ClassLoader classLoader = DruidTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("druid.properties");

        //2. 加载文件
        pro.load(is);

        //获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);

        //获取连接
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
}
