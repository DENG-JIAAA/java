package top.djosimon.factory;

import top.djosimon.service.ComputerRegulation;

/**
 * @author : dj
 * @date : 2020/11/28
 */

/*
 * 【第二步】
 *       创建目标类（需要被代理的类/生产电脑的厂家）实现接口。
 * */
public class ComputerFactory implements ComputerRegulation {
    @Override
    public double buyComputer(int amount) {
        // 电脑单价
        double price = 10000.0;
        double total = price * amount;
        System.out.println("【厂家生产电脑】共计：" + amount + "台，总价：" + total);
        return total;
    }
}
