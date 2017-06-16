package ObserverPattern;

/**
 * Created by hjy on 2017/6/16.
 * 观察者模式测试类
 * 观察者模式主要就是：当被观察者类发生改变的时候，依赖于这个类的观察者类也对应发生改变，
 *                  同时这两个类之间的耦合十分松
 */
public class mainTest {
    public static void main(String[] args) {
        //首先创建被观察者类
        Menu menu = new Menu();
        //然后创建观察者类
        Restaurant1 restaurant1 = new Restaurant1(menu);
        Restaurant2 restaurant2 = new Restaurant2(menu);
        //首次查看默认的菜单
        restaurant1.display();
        restaurant2.Cancel();
        //对菜单进行修改
        menu.changeMenu("回锅肉", "夫妻肺片");
    }
}
