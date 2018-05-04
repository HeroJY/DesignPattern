package CommandPattern;

/**
 * Created by hjy on 2017/6/28.
 * 命令模式中的命令对象
 */
public class LightOnCommand implements Command {
    /**
     * 定义接收对象的类型
     */
    private Light light;
    /**
     * 记录一下当前灯的状态，为撤销做储备
     */
    private String presentElectric;
    private String presentStatus;
    private int presentBrightness;

    /**
     * 构造方法中确定接收者
     */
    public LightOnCommand(Light light) {
        this.light = light;
    }

    //如果一直执行，灯的亮度会越来越高
    //封装一系列接口（算法）
    @Override
    public void execute() {
        presentElectric = light.getElectric();
        presentStatus = light.getStatus();
        presentBrightness = light.getBrightness();
        //首先打开电源
        light.turnOnElectric();
        //然后把灯打开
        light.turnOn();
        //最后把亮度调整到1
        light.increaseBrightness();
    }

    //撤销，点击后会回退到上一个状态
    @Override
    public void undo() {
        if (presentElectric.equals("on")) {
            light.turnOnElectric();
            light.decreaseBrightness();
        }
        if (presentStatus.equals("on")) {
            light.turnOnElectric();
            light.decreaseBrightness();
        }
        if (presentElectric.equals("off")) {
            light.turnOffElectric();
            light.decreaseBrightness();
        }
        if (presentStatus.equals("off")) {
            light.turnOff();
            light.decreaseBrightness();
        }
    }
}
