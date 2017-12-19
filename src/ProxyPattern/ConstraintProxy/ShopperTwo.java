package ProxyPattern.ConstraintProxy;

/**
 * Created by hjy on 2017/12/19.
 * 实际购买者2
 */
public class ShopperTwo implements Shopper {
    /**
     * 购买者名称
     */
    private String name = "";

    /**
     * 我的代理类
     */
    private Shopper proxy = null;

    public ShopperTwo(String name) {
        this.name = name;
    }

    @Override
    public void buy() {
        if (isProxy()) {
            System.out.println( "我是购物者：" + this.name + ",购买了switch！" );
        } else {
            System.out.println( "请使用指定的代理类" );
        }
    }

    @Override
    public void count() {
        if (isProxy()) {
            System.out.println( "switch也要2000块！" );
        } else {
            System.out.println( "请使用指定的代理类" );
        }
    }

    @Override
    public Shopper getProxy() {
        this.proxy = new ShopperProxy( this );
        return this.proxy;
    }

    private boolean isProxy() {
        if (this.proxy == null) {
            return false;
        } else {
            return true;
        }
    }
}
