package by.rublevskaya.model.command.control;

import by.rublevskaya.model.command.Command;
import by.rublevskaya.model.command.smarthome.Light;

public class LightOffCommand implements Command {
    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}

