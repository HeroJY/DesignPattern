package ProxyPattern.CommonProxy;

/**
 * Created by hjy on 2017/12/19.
 * 普通代理模式的总接口（购买者）
 */
public interface Shopper {
    /**
     * 购买商品
     */
    void buy();

    /**
     * 排队结账
     */
    void count();
}
