package by.rublevskaya.model.command.control;

import by.rublevskaya.model.command.Command;
import by.rublevskaya.model.command.smarthome.Light;

public class LightOnCommand implements Command {
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
