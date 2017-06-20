package SingletonPattern;

/**
 * Created by hjy on 2017/6/20.
 * 单例模式：懒汉式 只会在首次访问这个类的时候实例化，需要注意线程安全问题
 */
public class Singleton1 {
    //定义一个成员变量
    private static Singleton1 singleton1 = null;

    //私有化构造函数
    private Singleton1() {

    }

    //定义对外暴露接口
    public static synchronized Singleton1 getSingleton1() {
        if (singleton1 == null) {
            return new Singleton1();
        } else {
            return singleton1;
        }
    }
}
