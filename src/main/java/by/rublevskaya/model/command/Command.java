package by.rublevskaya.model.command;

public interface Command {
    void execute();
    void undo();
}
