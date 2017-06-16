package ObserverPattern;

/**
 * Created by hjy on 2017/6/16.
 * 观察者1，当被观察者发生变化的时候展示的菜单需要变化，但不直接和观察者发生耦合
 */
public class Restaurant1 implements Observer {
    //观察者
    Menu menu;
    //热菜
    private String HotDish;
    //凉菜
    private String ColdDish;

    //构造方法里注册自己
    public Restaurant1(Menu menu) {
        this.menu = menu;
        this.HotDish = menu.getHotDish();
        this.ColdDish = menu.getColdDish();
        menu.registerObserver(this);
    }

    //把自己从注册表里删除
    public void Cancel() {
        menu.removeObserver(this);
    }

    @Override
    public void update() {
        this.HotDish = menu.getHotDish();
        this.ColdDish = menu.getColdDish();
        display();
    }

    //展示菜单
    public void display() {
        System.out.println("本餐厅热菜：" + HotDish);
        System.out.println("本餐厅凉菜：" + ColdDish);
    }
}
