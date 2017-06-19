package DecoratePattern;

/**
 * Created by hjy on 2017/6/19.
 * 装饰者模式测试类
 * 装饰者模式主要就是：动态的给对象添加一些功能。可以根据条件来添加。
 */
public class mainTest {
    public static void main(String[] args) {
        double price;
        String name;
        Beverage coffee = new Coffee();
        coffee = new Milk(coffee);
        coffee = new Mocha(coffee);
        coffee = new Mocha(coffee);
        price = coffee.cost();
        name = coffee.getName();
        System.out.println(name);
        System.out.println(price);
    }
}
