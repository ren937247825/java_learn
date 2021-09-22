package cn.itcast.datasource.druid;

import cn.itcast.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DruidDemo2 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "INSERT INTO `ms_test`.`tab_category`(`cid`, `cname`) VALUES (null, ?);";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,"rjf2");
            pstmt.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(pstmt, conn);
        }
    }
}
