package ProxyPattern.ConstraintProxy;

/**
 * Created by hjy on 2017/12/19.
 * 强制代理的代理类
 */
public class ShopperProxy implements Shopper {
    /**
     * 被代理的类
     */
    private Shopper proxy = null;

    public ShopperProxy(Shopper proxy) {
        this.proxy = proxy;
    }

    @Override
    public void buy() {
        this.proxy.buy();
    }

    @Override
    public void count() {
        this.proxy.count();
    }

    @Override
    public Shopper getProxy() {
        return this;
    }
}
