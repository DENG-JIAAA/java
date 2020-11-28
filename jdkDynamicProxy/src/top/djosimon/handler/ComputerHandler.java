package top.djosimon.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author : dj
 * @date : 2020/11/28
 */

/*
 * 【第三步】
 *       创建InvocationHandler接口的实现类（调用处理器）
 *       重写invoke()方法，在方法内部完成代理类需要完成的功能。
 * */
public class ComputerHandler implements InvocationHandler {
    // 可以动态指定要代理的目标类，target即为目标对象。
    private Object target;

    public ComputerHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // target目标对象完成了方法的调用工作，而不用知道方法的名字。
        // method.invoke()的返回值就是对象方法的返回值。
        Object ret = method.invoke(target, args);
        if (ret != null) {
            // 代理类（商家）加价1.5倍，然后挂售。
            double salePri = (double) ret;
            salePri = salePri * 1.5;
            ret = salePri;
        }
        System.out.println("【商家出售电脑】，共：" + ret);
        System.out.println("商家返优惠卷（功能增强）");
        return ret;
    }
}
