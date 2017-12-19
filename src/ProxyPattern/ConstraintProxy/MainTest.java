package ProxyPattern.ConstraintProxy;

/**
 * Created by hjy on 2017/12/19.
 * 强制代理模式：必须使用真实类的代理类进行操作，而且代理类由真实类管理。这样保证了代码的安全性
 */
public class MainTest {
    public static void main(String[] args) {
        //直接访问真实类
        Shopper shopper = new ShopperTwo( "小智" );
        shopper.buy();
        shopper.count();
        //直接访问代理类
        Shopper proxy = new ShopperProxy( shopper );
        proxy.buy();
        proxy.count();
        //使用真实类查找代理类
        shopper.getProxy().buy();
        shopper.getProxy().count();
    }
}
