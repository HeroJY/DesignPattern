package CommandPattern;

/**
 * Created by hjy on 2017/6/28.
 * 命令模式测试类
 * 命令模式：封装行为。对外只暴露简单接口，同时可以回退上一个命令
 */
public class mainTest {
    public static void main(String[] args) {
        //拿一个控制器(这个控制器有两个按钮)
        RemoteControl remoteControl = new RemoteControl();
        //定义一个接收者
        Light light = new Light();
        //确定一个命令,并传入接收者
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        //控制器装载命令（传入数字代表按钮位置）（这个也可以做成构造方法装载）
        remoteControl.setCommand(0, lightOnCommand);
        remoteControl.setCommand(1, lightOffCommand);
        //控制器调用方法
        remoteControl.doSomeThing(0);
        System.out.println(light.getBrightness() + " " + light.getStatus() + " " + light.getElectric());
        remoteControl.doSomeThing(1);
        System.out.println(light.getBrightness() + " " + light.getStatus() + " " + light.getElectric());
        //撤销上一步动作
        remoteControl.rollback();
        System.out.println(light.getBrightness() + " " + light.getStatus() + " " + light.getElectric());
    }
}
