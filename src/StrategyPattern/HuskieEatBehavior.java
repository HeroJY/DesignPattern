package StrategyPattern;

/**
 * Created by hjy on 2017/6/13.
 * 一种算法：哈士奇吃的行为
 */
public class HuskieEatBehavior implements EatBehavior{
    @Override
    public void eat() {
        System.out.println("我是一只哈士奇努力的找骨头然后吃掉鞋子");
    }
}
