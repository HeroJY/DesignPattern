package FactoryPattern.FactoryMethod;

/**
 * Created by hjy on 2017/6/21.
 * 这个是产品的一种，由不同的工厂负责创建这个产品
 */
public class AudiCar implements Car {
    public AudiCar() {
        System.out.println("AudiCar1");
    }

    @Override
    public void stop() {
        System.out.println("Audi1 stopping!");
    }

    @Override
    public void driven() {
        System.out.println("Audi1 running!");
    }
}
