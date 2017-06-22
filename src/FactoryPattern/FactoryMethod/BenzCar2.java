package FactoryPattern.FactoryMethod;

/**
 * Created by hjy on 2017/6/21.
 * 这个是产品的一种，由不同的工厂负责创建这个产品
 */
public class BenzCar2 implements Car {
    public BenzCar2() {
        System.out.println("BenzCar2");
    }

    @Override
    public void driven() {
        System.out.println("Benz2 running!");
    }

    @Override
    public void stop() {
        System.out.println("Benz2 stopping!");
    }
}
