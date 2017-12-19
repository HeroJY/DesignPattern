package ProxyPattern.CommonProxy;

/**
 * Created by hjy on 2017/12/19.
 * 实际购买者1
 */
public class ShopperOne implements Shopper {
    /**
     * 购买者名称
     */
    private String name = "";

    public ShopperOne(Shopper shopper, String name) throws Exception {
        if (shopper == null) {
            throw new Exception( "不能创建真实对象" );
        } else {
            this.name = name;
        }
    }

    @Override
    public void buy() {
        System.out.println( "我是购买者1：" + name + "我买了ps4！" );
    }

    @Override
    public void count() {
        System.out.println( "ps4要2000块！" );
    }
}
