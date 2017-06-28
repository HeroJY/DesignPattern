package CommandPattern;

/**
 * Created by hjy on 2017/6/28.
 * 命令模式统一接口
 */
public interface Command {
    //执行
    void execute();
    //撤销
    void undo();
}
