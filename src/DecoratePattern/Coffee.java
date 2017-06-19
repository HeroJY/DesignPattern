package DecoratePattern;

/**
 * Created by hjy on 2017/6/19.
 * 装饰者模式的ConcreteComponent 具体的组建
 */
public class Coffee implements Beverage {
    @Override
    public double cost() {
        return 2.0;
    }

    public String getName(){
        return "Coffee";
    }

}
