package top.djosimon.servlet.servlet_learn_01;

/**
 * @author : dj
 * @date : 2020/11/8
 */
public class DeleteServlet implements Servlet {
    // 程序员面向已经制定好的Servlet接口进行服务端的小java程序编写
    @Override
    public void service() {
        System.out.println("正在执行删除操作，请稍等...\n");
    }
}
