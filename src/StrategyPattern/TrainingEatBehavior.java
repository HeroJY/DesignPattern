package StrategyPattern;

/**
 * Created by hjy on 2017/6/13.
 * 一种算法：训练后的狗吃的行为
 */
public class TrainingEatBehavior implements EatBehavior{
    @Override
    public void eat() {
        System.out.println("安静愉快的吃骨头");
    }
}
