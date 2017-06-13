package StrategyPattern;

/**
 * Created by hjy on 2017/6/13.
 * 策略模式测试类
 * 策略模式主要就是：策略模式提供了管理相关的算法族的办法。
 *                策略类的等级结构定义了一个算法或行为族。
 *                恰当使用继承可以把公共的代码移到父类里面，从而避免代码重复
 */
public class mainTest {
    public static void main(String[] args) {
        //确认狗的种类
        Dog Adog = new Huskie();
        //查看默认初始化的算法
        Adog.bark();
        Adog.eat();
        System.out.println("经过训练后！");
        //经过修改后的算法
        Adog.setEatBehavior(new TrainingEatBehavior());
        Adog.eat();
    }
}
