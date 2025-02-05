package by.rublevskaya.model.command.control;

import by.rublevskaya.model.command.Command;
import by.rublevskaya.model.command.smarthome.Fan;

public class FanStartCommand implements Command {
    private final Fan fan;

    public FanStartCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.start();
    }

    @Override
    public void undo() {
        fan.stop();
    }
}
