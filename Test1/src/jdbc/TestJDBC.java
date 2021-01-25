package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

/**
 * @Author: liam
 * @Date: 2021/1/21 17:22
 */
public class TestJDBC {
    public static void main(String[] args) {

        /*try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (
                Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mystudy?characterEncoding=UTF-8",
                        "root", "c925445388");

                Statement s = c.createStatement();
        )
        {

            for (int i = 0; i < 100; i++) {
                String sql = "insert into hero values(null," + "'英雄"+i+"'"  + "," + Math.random()*100 + "," + 50+i + ")";
                s.execute(sql);
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mystudy?characterEncoding=UTF-8",
                    "root", "c925445388");


            Statement s = c.createStatement();

            // 准备sql语句
            // 注意： 字符串要用单引号'
            String sql = "insert into hero values(null,"+"'提莫'"+","+313.0f+","+50+")";
            s.execute(sql);

            System.out.println("执行插入语句成功");

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}