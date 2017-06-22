package FactoryPattern.AbstractFactory;

/**
 * Created by hjy on 2017/6/22.
 * 具体的奔驰商店
 */
public class BenzStore extends Store {
    //定义不同的品牌工厂
    CarFactory BenzCarFactory = new BenzCarFactory();

    @Override
    Car createCar(String type) {
        if (type.equals("运动类型")) {
            return new SportCar(BenzCarFactory);
        } else if (type.equals("商务类型")) {
            return new BusinessCar(BenzCarFactory);
        } else {
            return null;
        }
    }
}
