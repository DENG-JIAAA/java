package top.djosimon.util;


import java.sql.*;

/**
 * @author : dj
 * @date : 2020/11/27
 */
public class DBUtil {
    /**
     * 工具类中的构造方法都是【私有的】。
     * 因为工具类中的方法都是静态的，不需要new对象，直接采用类名调用。
     */
    private DBUtil() {
    }

    /*数据库连接信息*/
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/learn?serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";

    /**
     * 静态代码块在类加载的时候执行，并且只执行一次。
     * 将jar包中的Driver实现类加载到JVM中。
     */
    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库连接对象，封装连接对象。
     *
     * @return 返回数据库连接对象
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    /**
     * 释放连接，关闭资源。
     *
     * @param conn 数据库连接对象
     * @param stat 数据库操作对象
     * @param rs   结果集
     */
    public static void close(Connection conn, Statement stat, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stat != null) {
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
