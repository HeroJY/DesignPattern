package FactoryPattern.FactoryMethod;

/**
 * Created by hjy on 2017/6/21.
 * 具体的工厂：这里具体实现抽象工厂里的方法，这里也是new对象的地方.这里根据店的不同，只new奔驰车
 *           客户只需要调用该工厂就可以获得车，而不需要由客户去new
 */
public class ConcreteFactory implements AbstractFactory {
    @Override
    public Car createCar(int type) {
        if(type == 1){
            return new BenzCar();
        }
        if(type == 2){
            return new BenzCar2();
        }else {
            return null;
        }
    }

    @Override
    public Car getCar(int type) {
       return createCar(type);
    }
}
