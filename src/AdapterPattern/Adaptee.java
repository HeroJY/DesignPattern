package AdapterPattern;

/**
 * Created by hjy on 2017/7/12.
 * 适配器模式中需要适配的类
 */
public class Adaptee {
    public void excute(){
        System.out.println("我是需要适配的类" + this.getClass().getName());
    }
}
