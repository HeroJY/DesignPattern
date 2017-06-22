package FactoryPattern.AbstractFactory;

/**
 * Created by hjy on 2017/6/22.
 * 具体的产品：运动车型
 */
public class SportCar extends Car {
    CarFactory carFactory;
    public SportCar(CarFactory carFactory) {
        this.carFactory = carFactory;
        brand = carFactory.setBrand();
        type = "运动类型";
    }
}
