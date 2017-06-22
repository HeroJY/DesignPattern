package FactoryPattern.FactoryMethod;

/**
 * Created by hjy on 2017/6/21.
 * 工厂方法模式：主要实现了开闭原则，当用户从不同的店购买车时都调用同一个接口，开走也用同一个接口。
 *             这里主要把客户的调用和工厂的实现解耦了。
 */
public class mainTest {
    public static void main(String[] args) {
        //创建不同的店
        AbstractFactory BenzFactory = new ConcreteFactory();
        AbstractFactory AudiFactory = new ConcreteFactory2();
        //调用相同的接口
        Car car1 = BenzFactory.getCar(2);
        Car car2 = AudiFactory.getCar(1);
        car1.driven();
        car2.driven();
    }
}
