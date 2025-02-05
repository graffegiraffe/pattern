package by.rublevskaya.model.command;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        if (command != null) {
            command.execute();
        } else {
            System.out.println("No command to execute");
        }
    }

    public void pressUndo() {
        if (command != null) {
            command.undo();
        } else {
            System.out.println("No command to cancel");
        }
    }
}
