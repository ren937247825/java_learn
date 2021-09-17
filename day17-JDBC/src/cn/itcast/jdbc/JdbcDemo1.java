package cn.itcast.jdbc;

import java.sql.*;

public class JdbcDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //导入jar包
        //注册驱动
//        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ms_test", "root", "root");
        String sql = "UPDATE `ms_test`.`tab_user` SET `username` = 'rjf123' WHERE `uid` = 1";
        Statement statement = connection.createStatement();
        int count = statement.executeUpdate(sql);
        System.out.println(count);
        statement.close();
        connection.close();
    }
}
