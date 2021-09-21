package cn.itcast.jdbc;

import cn.itcast.domain.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcDemo4 {
    public static void main(String[] args) throws NullPointerException{
        List<Emp> list = new JdbcDemo4().findAll();
        System.out.println(list);
    }

    public List<Emp> findAll() {
        List<Emp> list = null;
        Connection conn = null;
        ResultSet rs = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///ms_test", "root", "root");
            String sql = "select * from tab_user";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            Emp emp = null;
            list = new ArrayList<>();
            while (rs.next()) {
                int uid = rs.getInt("uid");
                String username = rs.getString("username");
                String password = rs.getString("PASSWORD");
                String name = rs.getString("NAME");
                Date birthday = rs.getDate("birthday");
                String sex = rs.getString("sex");
                String telephone = rs.getString("telephone");
                String email = rs.getString("email");

                emp = new Emp();
                emp.setUid(uid);
                emp.setUsername(username);
                emp.setPassword(password);
                emp.setName(name);
                emp.setBirthday(birthday);
                emp.setSex(sex);
                emp.setTelephone(telephone);
                emp.setEmail(email);
                list.add(emp);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return list;
    }
}
