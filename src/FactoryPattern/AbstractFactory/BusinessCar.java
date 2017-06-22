package FactoryPattern.AbstractFactory;

/**
 * Created by hjy on 2017/6/22.
 * 具体的产品：商务车型
 */
public class BusinessCar extends Car {
    CarFactory carFactory;

    public BusinessCar(CarFactory carFactory) {
        this.carFactory = carFactory;
        brand = carFactory.setBrand();
        type = "商务类型";
    }
}
