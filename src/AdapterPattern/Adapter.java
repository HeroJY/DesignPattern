package AdapterPattern;

/**
 * Created by hjy on 2017/7/12.
 * 适配器模式中的适配器
 */
public class Adapter implements Target{
    //持有被适配的类
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.excute();
    }
}
