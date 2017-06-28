package CommandPattern;

/**
 * Created by hjy on 2017/6/28.
 * 命令模式中的接收者
 */
public class Light {
    private String status = "off";
    private String electric = "off";
    //灯的光照强度：0，1，2，3；
    private int brightness = 0;

    //开电源
    public void turnOnElectric() {
        this.electric = "on";
    }

    //开灯
    public void turnOn() {
        this.status = "on";
    }

    //关电源
    public void turnOffElectric() {
        this.electric = "off";
    }

    //关灯
    public void turnOff() {
        this.status = "off";
    }

    //调高亮度
    public void increaseBrightness() {
        if (brightness == 3) {
            this.brightness = 3;
        } else {
            brightness++;
        }
    }

    //调低亮度
    public void decreaseBrightness() {
        if (brightness == 0) {
            this.brightness = 0;
        } else {
            brightness--;
        }
    }

    public String getStatus() {
        return status;
    }

    public String getElectric() {
        return electric;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
}
