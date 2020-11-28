package top.djosimon;

import top.djosimon.factory.ComputerFactory;
import top.djosimon.handler.ComputerHandler;
import top.djosimon.service.ComputerRegulation;

import java.lang.reflect.Proxy;

/**
 * @author : dj
 * @date : 2020/11/28
 */
public class MainShop {
    public static void main(String[] args) {
        // 厂家
        ComputerRegulation factory = new ComputerFactory();
        // 调用处理器
        ComputerHandler handler = new ComputerHandler(factory);
        // 【第四步】使用Proxy类的静态方法，创建代理对象，将返回值转换为接口类型。
        ComputerRegulation proxy = (ComputerRegulation) Proxy.newProxyInstance(factory.getClass().getClassLoader(),
                factory.getClass().getInterfaces(),
                handler);
        int amount = 2;
        // 通过代理对象买电脑
        double total = proxy.buyComputer(amount);
        System.out.println("通过代理对象进行电脑的购买，" + amount + "台，共计" + total);
    }
}
