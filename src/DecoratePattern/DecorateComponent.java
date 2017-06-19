package DecoratePattern;

/**
 * Created by hjy on 2017/6/19.
 * 装饰者模式的DecorateComponent 这个是装饰类的超类，为了给装饰类继承使用
 */
public abstract class DecorateComponent implements Beverage {
    private String name;
    @Override
    public abstract double cost();

    public String getName() {
        return name;
    }
}
