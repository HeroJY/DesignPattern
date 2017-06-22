package FactoryPattern.FactoryMethod;

/**
 * Created by hjy on 2017/6/21.
 * 这是工厂方法模式的抽象工厂：这里可以使用不同商店创建一辆车来作为例子
 */
public interface AbstractFactory {
    //获取一辆车的方法
    Car getCar(int type);
    //创建一辆车的方法
    Car createCar(int type);
}
