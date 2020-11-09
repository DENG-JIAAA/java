package top.djosimon.servlet.servlet_learn_01;

import java.io.FileReader;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author : dj
 * @date : 2020/11/8
 */
public class TomcatServer {
    // 模拟Tomcat服务器/容器
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("正在启动服务器，服务器启动成功。");
        while (true) {
            System.out.print("打开浏览器，在浏览器地址栏输入请求路径（如：/login、/delete、/save）：");
            String resourcePath = scanner.next();

            // Tomcat读取配置文件
            FileReader reader = new FileReader("D:\\workspace\\idea\\ideaprojects\\servlet\\src\\top\\djosimon\\servlet\\servlet_learn_01\\web.xml");
            Properties pro = new Properties();
            pro.load(reader);
            reader.close();

            // 通过key获取value
            String servletClassName = pro.getProperty(resourcePath);
            // 通过反射机制创建对象
            Class servletClass = Class.forName(servletClassName);
            Servlet servlet = (Servlet) servletClass.newInstance();
            servlet.service();
        }
    }
}
