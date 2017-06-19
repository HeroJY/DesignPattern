package DecoratePattern;

/**
 * Created by hjy on 2017/6/19.
 * 装饰者类的ConcreteDecorate 这个就是装饰者类
 */
public class Milk extends DecorateComponent {
    //首先需要记录一下被装饰的超类
    Beverage beverage;

    //这里把被装饰的类传入
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 2.2;
    }

    @Override
    public String getName() {
        return "Milk " + beverage.getName();
    }
}
