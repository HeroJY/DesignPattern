package FactoryPattern.FactoryMethod;

/**
 * Created by hjy on 2017/6/21.
 * 这个是产品的一种，由不同的工厂负责创建这个产品
 */
public class BenzCar implements Car {
    public BenzCar() {
        System.out.println("BenzCar1");
    }

    @Override
    public void driven() {
        System.out.println("Benz1 running!");
    }

    @Override
    public void stop() {
        System.out.println("Benz1 stopping!");
    }
}
