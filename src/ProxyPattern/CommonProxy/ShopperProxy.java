package ProxyPattern.CommonProxy;

/**
 * Created by hjy on 2017/12/19.
 * @author hjy
 * 代理购买者
 */
public class ShopperProxy implements Shopper {
    /**
     * 代理对象
     */
    private Shopper shopper = null;

    /**
     * 这里进行异常捕获和限制
     * @param name 用户名称
     */
    public ShopperProxy(String name){
        try {
            this.shopper = new ShopperOne( this,name );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void buy() {
        this.shopper.buy();
    }

    @Override
    public void count() {
        this.shopper.count();
    }
}
