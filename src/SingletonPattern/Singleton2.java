package SingletonPattern;

/**
 * Created by hjy on 2017/6/20.
 * 单例模式：饿汉式 一开始就初始化对象，不存在线程安全问题
 */
public class Singleton2 {
    //定义一个成员变量
    private static Singleton2 singleton2 = new Singleton2();

    //私有化构造函数
    public Singleton2() {
    }

    //定义对外暴露的接口
    public static Singleton2 getSingleton2(){
        return singleton2;
    }
}
