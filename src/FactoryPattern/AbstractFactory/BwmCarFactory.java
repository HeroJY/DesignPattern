package FactoryPattern.AbstractFactory;

/**
 * Created by hjy on 2017/6/22.
 * 这是具体的品牌工厂（宝马）
 */
public class BwmCarFactory implements CarFactory {
    @Override
    public String setBrand() {
        return "宝马";
    }
}
