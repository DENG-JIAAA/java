package top.djosimon;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.djosimon.service.UserService;

/**
 * @author : dj
 * @date : 2020/12/5
 */
public class TestUserService {
    @Test
    public void test01() {
        String config = "applicationContext.xml";
        ApplicationContext app = new ClassPathXmlApplicationContext(config);
        UserService service = (UserService) app.getBean("userService");
        System.out.println(service.getOneGoodsInfoById(2));
    }
    @Test
    public void test02() {
        String config = "applicationContext.xml";
        ApplicationContext app = new ClassPathXmlApplicationContext(config);
        UserService service = (UserService) app.getBean("userService");
        service.buyGoodsByIdAndNums(1,1);
    }
}
