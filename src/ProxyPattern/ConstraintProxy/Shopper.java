package ProxyPattern.ConstraintProxy;

/**
 * Created by hjy on 2017/12/19.
 * 强制代理的总接口（购买者）
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

    /**
     * 获取代理类
     * @return Shopper 返回代理类
     */
    Shopper getProxy();
}
