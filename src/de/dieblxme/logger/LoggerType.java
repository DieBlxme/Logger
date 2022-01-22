package de.dieblxme.logger;

public enum LoggerType {
    INFO("[INFO]"),
    ERROR("[ERROR]"),
    WARNING("[WARN]");

    private String prefix;

    private LoggerType(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return prefix;
    }
}
