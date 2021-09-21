package cn.itcast.jdbc;

import java.sql.*;

public class JdbcDemo3 {
    public static void main(String[] args) throws ClassNotFoundException {
        Statement statement = null;
        Connection connection = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "INSERT INTO `ms_test`.`tab_user` VALUES (null, 'rjf91', '123456', 'janus91', '2021-09-17', '男', '18380497559', '937247825@qq.com');";
            connection = DriverManager.getConnection("jdbc:mysql:///ms_test", "root", "root");
            statement = connection.createStatement();
            int count = statement.executeUpdate(sql);
            System.out.println(count);
            if (count > 0) {
                System.out.println("添加成功");
            } else {
                System.out.println("添加失败");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
//            statement.close();
            //避免空指针异常
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
