package top.djosimon.servlet.servlet_learn_01;

/**
 * @author : dj
 * @date : 2020/11/8
 */
public class SaveServlet implements Servlet {
    // 面向接口进行编程
    @Override
    public void service() {
        System.out.println("正在保存用户数据...\n");
    }
}
