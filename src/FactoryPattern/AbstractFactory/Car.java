package FactoryPattern.AbstractFactory;

/**
 * Created by hjy on 2017/6/22.
 * 产品车的超类
 */
public abstract class Car {
    String brand;
    String type;

    public void run() {
        System.out.println(this.brand + this.type + " running!");
    }

    ;
}
