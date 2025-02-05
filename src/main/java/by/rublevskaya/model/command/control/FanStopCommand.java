package by.rublevskaya.model.command.control;

import by.rublevskaya.model.command.Command;
import by.rublevskaya.model.command.smarthome.Fan;

public class FanStopCommand implements Command {
    private final Fan fan;

    public FanStopCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.stop();
    }

    @Override
    public void undo() {
        fan.start();
    }
}

