package FactoryPattern.AbstractFactory;

/**
 * Created by hjy on 2017/6/22.
 * 客户直接要求一种类型的车
 */
public class mainTest {
    public static void main(String[] args) {
        Car car;
        Car car2;
        //首先到一家车店（奥迪或者奔驰）
        Store store = new BenzStore();
        Store store2 = new BwmStore();
        //接着要了一辆运动型的或者商务类型的车
        car = store.getCar("运动类型");
        car2 = store2.getCar("运动类型");
        //开着就走了
        car.run();
        car2.run();
    }
}
