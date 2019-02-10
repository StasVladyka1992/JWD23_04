package by.vladyka.epam.service.impl;

import by.vladyka.epam.service.Command;

public class SimpleCommand implements Command {
    @Override
    public String execute() {
     return "не раб";
    }
}
