package by.vladyka.epam.service;

import by.vladyka.epam.service.impl.SimpleCommand;

public class CommandFactory {
    private static final CommandFactory commandFactory = new CommandFactory();

    private CommandFactory() {
    }

    public static CommandFactory getCommandFactory() {
        return commandFactory;
    }

    public Command getCommand(){
        return new SimpleCommand();
    }

}
