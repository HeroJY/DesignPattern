package AdapterPattern;

/**
 * Created by hjy on 2017/7/12.
 * 客户端调用程序（测试类）
 */
public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        NoAdaptee noAdaptee = new NoAdaptee();
        Target target = new Adapter(adaptee);
        target.request();
        noAdaptee.request();
    }
}
