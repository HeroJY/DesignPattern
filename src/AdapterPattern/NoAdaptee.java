package AdapterPattern;

/**
 * Created by hjy on 2017/7/12.
 * 不需要适配的类
 */
public class NoAdaptee implements Target{
    @Override
    public void request() {
        System.out.println("我是不需要适配的类" + this.getClass().getName());
    }
}
