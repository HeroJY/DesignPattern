package FactoryPattern.FactoryMethod;

/**
 * Created by hjy on 2017/6/21.
 * 这个是产品的一种，由不同的工厂负责创建这个产品
 */
public class AudiCar2 implements Car {
    public AudiCar2() {
        System.out.println("AudiCar2");
    }

    @Override
    public void stop() {
        System.out.println("Audi2 stopping!");
    }

    @Override
    public void driven() {
        System.out.println("Audi2 running!");
    }
}

