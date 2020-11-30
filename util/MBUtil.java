package top.djosimon.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author : dj
 * @date : 2020/11/30
 */
public class MBUtil {

    private static SqlSessionFactory factory = null;

    private MBUtil() {
    }

    /**
     * 加载配置，构建工厂。
     */
    static {
        String config = "Mybatis.xml";
        try {
            // 加载配置文件
            InputStream in = Resources.getResourceAsStream(config);
            // 构建工厂
            factory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取sqlSession对象
     *
     * @return sqlSession对象
     */
    public static SqlSession getSqlSession() {
        SqlSession sqlSession = null;
        if (factory != null) {
            sqlSession = factory.openSession();// 非自动提交事务
        }
        return sqlSession;
    }
}
