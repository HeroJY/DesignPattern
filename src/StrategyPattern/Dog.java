package StrategyPattern;

/**
 * Created by hjy on 2017/6/13.
 * 这是调用者的超类
 */
public class Dog {
    //这里定义算法族（一般是容易变的地方）
    public EatBehavior eatBehavior;

    //这里定义不变的共用方法
    public void bark(){
        System.out.println("汪汪汪");
    }
    //这里可以动态修改算法族
    public void setEatBehavior(EatBehavior eatBehavior){
        this.eatBehavior = eatBehavior;
    }
    //这里调用算法族里的方法
    public void eat(){
        eatBehavior.eat();
    }
}
