package cn.itcast.jdbcTemplate;

import cn.itcast.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCTemplateDemo1 {

    public static void main(String[] args) throws Exception {
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "UPDATE `jdbc_test`.`tab_category` SET `cname` = 'rjf123' WHERE `cid` = ?";
        int count = template.update(sql, 1);
        System.out.println(count);
    }
}
