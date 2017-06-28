package CommandPattern;

/**
 * Created by hjy on 2017/6/28.
 * 命令模式中的命令对象
 */
public class LightOffCommand implements Command {
    //定义接收对象的类型
    private Light light;

    //构造方法中确定接收者
    public LightOffCommand(Light light) {
        this.light = light;
    }

    //记录一下当前灯的状态，为撤销做储备
    String presentElectric;
    String presentStatus;
    int presentBrightness;

    //封装一系列接口（算法）
    @Override
    public void execute() {
        presentElectric = light.getElectric();
        presentStatus = light.getStatus();
        presentBrightness = light.getBrightness();
        //首先关闭电灯
        light.turnOff();
        //然后调低亮度
        light.setBrightness(0);
        //最后关闭电源
        light.turnOffElectric();
    }

    //撤销，点击后会回退到上一个状态
    @Override
    public void undo() {
        //只有当上一次的状态是开灯的时候才执行
        if (presentElectric.equals("on") && presentStatus.equals("on")) {
            light.turnOnElectric();
            light.turnOn();
            light.setBrightness(presentBrightness);
        }
    }
}
