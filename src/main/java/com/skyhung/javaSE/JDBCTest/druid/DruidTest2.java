package com.skyhung.javaSE.JDBCTest.druid;

import com.skyhung.javaSE.JDBCTest.utils.JDBC_Druid_Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author zth
 * @date 2019/11/1 16:47
 */
public class DruidTest2 {
    public static void main(String[] args) throws Exception {
        Connection connection = JDBC_Druid_Utils.getConnection();
        PreparedStatement p = connection.prepareStatement("select * from user");
        ResultSet resultSet =p.executeQuery();
        while(resultSet.next()){
            System.out.println(resultSet.getString("uname"));
        }
        JDBC_Druid_Utils.close(resultSet,p,connection);
    }
}
