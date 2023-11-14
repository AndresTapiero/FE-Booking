package org.example.utilities;

public enum ShellCommands {
    SET_PASSWORD("adb shell input text 1234"),
    MAKE_TAP("adb shell input keyevent 66");

    private String command;

    ShellCommands(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}
