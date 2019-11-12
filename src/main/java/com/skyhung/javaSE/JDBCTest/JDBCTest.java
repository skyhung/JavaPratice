package com.skyhung.javaSE.JDBCTest;

import com.skyhung.javaSE.JDBCTest.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author zth
 * @date 2019/11/1 15:06
 */
public class JDBCTest {
    public static void main(String[] args) throws SQLException {
        Connection connection = JDBCUtils.getConnection();
        PreparedStatement p = connection.prepareStatement("select * from user");
        ResultSet resultSet =p.executeQuery();
        while(resultSet.next()){
            System.out.println(resultSet.getString("uname"));
        }
    }
}
