package StrategyPattern;

/**
 * Created by hjy on 2017/6/13.
 * 哈士奇，属于狗的子类
 */
public class Huskie extends Dog{
    //构造方法中首先确定使用哈士奇的进食习惯
    public Huskie(){
        eatBehavior = new HuskieEatBehavior();
    }
}
