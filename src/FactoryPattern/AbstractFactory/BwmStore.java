package FactoryPattern.AbstractFactory;

/**
 * Created by hjy on 2017/6/22.
 */
public class BwmStore extends Store {
    //定义不同的品牌工厂
    CarFactory BwmCarFactory = new BwmCarFactory();

    @Override
    Car createCar(String type) {
        Car car = null;
        if (type.equals("运动类型")) {
            car = new SportCar(BwmCarFactory);
        } else if (type.equals("商务类型")) {
            car = new BusinessCar(BwmCarFactory);
        }
        return car;
    }
}
