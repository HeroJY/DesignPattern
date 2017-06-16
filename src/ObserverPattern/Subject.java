package ObserverPattern;

/**
 * Created by hjy on 2017/6/16.
 * 这个是被观察者需要实现的接口
 */
public interface Subject {
    //注册观察者
    void registerObserver(Observer observer);
    //删除观察者
    void removeObserver(Observer observer);
    //通知所有观察者
    void notifyAllObserver();
}
