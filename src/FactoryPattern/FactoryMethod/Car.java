package FactoryPattern.FactoryMethod;

/**
 * Created by hjy on 2017/6/21.
 * 这个是产品的超类，与抽象工厂类是平级的
 */
public interface Car {
    //车可以跑
    void driven();
    //车可以停
    void stop();
}
