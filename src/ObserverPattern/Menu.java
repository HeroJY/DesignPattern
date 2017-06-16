package ObserverPattern;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by hjy on 2017/6/16.
 * 被观察者，当菜单上的名字发生变化的时候，通知到各个餐馆的菜单
 */
public class Menu implements Subject {
    //注册列表
    private List<Observer> RestName;
    //热菜
    private String HotDish;
    //凉菜
    private String ColdDish;

    //构造方法中new列表
    public Menu() {
        this.RestName = new LinkedList<>();
        HotDish = "宫保鸡丁";
        ColdDish = "松花蛋";
    }

    @Override
    public void registerObserver(Observer observer) {
        RestName.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        RestName.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for (Observer x : RestName) {
            x.update();
        }
    }

    //每次修改菜单的时候通知各个餐馆
    public void changeMenu(String HotDish, String ColdDish) {
        this.HotDish = HotDish;
        this.ColdDish = ColdDish;
        notifyAllObserver();
    }

    //获得热菜
    public String getHotDish() {
        return HotDish;
    }

    //获得凉菜
    public String getColdDish() {
        return ColdDish;
    }
}
