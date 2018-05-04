package CommandPattern;

/**
 * Created by hjy on 2017/6/28.
 * 命令模式中的命令者
 */
public class RemoteControl {
    /**
     * 命令位置记录
     */
    Command[] commands;
    /**
     * 记录上一个命令
     */
    Command undoCommand;
    /**
     * 初始化一个空对象，用于初始化
     */
    Command noCommand = new NoCommand();

    public RemoteControl() {
        commands = new Command[2];
        //两个位置
        for (int i = 0; i < 2; i++) {
            commands[i] = noCommand;
        }
        //上一个命令也为空
        undoCommand = noCommand;
    }

    /**
     * 装载命令
     * @param slot
     * @param command
     */
    public void setCommand(int slot, Command command) {
        commands[slot] = command;
    }

    /**
     * 执行命令
     * @param slot
     */
    public void doSomeThing(int slot) {
        //执行命令
        commands[slot].execute();
        //把该命令记录下来
        undoCommand = commands[slot];
    }

    /**
     * 撤销上一个命令
     */
    public void rollback() {
        undoCommand.undo();
    }
}
