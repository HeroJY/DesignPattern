package FactoryPattern.AbstractFactory;


/**
 * Created by hjy on 2017/6/22.
 * 商店的抽象,可以创建多种类型的车
 */
public abstract class Store {

    public Car getCar(String type){
        Car car;
        car = createCar(type);
        return car;
    };

    abstract Car createCar(String type);
}

