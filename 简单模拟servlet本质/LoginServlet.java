package top.djosimon.servlet.servlet_learn_01;

/**
 * @author : dj
 * @date : 2020/11/8
 */
public class LoginServlet implements Servlet {
    // 服务端的小java程序实现了Servlet接口
    @Override
    public void service() {
        System.out.println("执行用户登录操作，正在验证用户名和密码...\n");
    }
}
