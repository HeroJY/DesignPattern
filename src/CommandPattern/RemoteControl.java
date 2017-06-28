package CommandPattern;

/**
 * Created by hjy on 2017/6/28.
 * 命令模式中的命令者
 */
public class RemoteControl {
    //首先需要有一个命令位置记录
    Command[] commands;
    //其次需要记录上一个命令
    Command undoCommand;
    //最后初始化一个空对象，用于初始化
    Command noCommand = new NoCommand();

    //构造函数中初始化位置。并放入空对象
    public RemoteControl() {
        commands = new Command[2];
        //两个位置
        for (int i = 0; i < 2; i++) {
            commands[i] = noCommand;
        }
        //上一个命令也为空
        undoCommand = noCommand;
    }

    //装载命令
    public void setCommand(int slot, Command command) {
        commands[slot] = command;
    }

    //执行命令
    public void doSomeThing(int slot) {
        //执行命令
        commands[slot].execute();
        //把该命令记录下来
        undoCommand = commands[slot];
    }

    //撤销上一个命令
    public void rollback() {
        undoCommand.undo();
    }
}
