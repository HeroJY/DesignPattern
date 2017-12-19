package ProxyPattern.CommonProxy;

/**
 * Created by hjy on 2017/12/19.
 * 普通代理模式测试类
 * 普通代理：只知道代理类，但是不知道代理的真实类是什么。这里通过名字来生成。而且只能使用代理类来操作。
 */
public class MainTest {
    public static void main(String[] args) {
        Shopper shopper = null;
//        Shopper shopper1 = new ShopperOne(shopper,"小王");
        Shopper shopperProxy = new ShopperProxy( "小王" );
//        shopper1.buy();
//        shopper1.count();
        shopperProxy.buy();
        shopperProxy.count();
    }
}
