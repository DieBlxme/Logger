package de.dieblxme.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private LoggerType type;
    private String text;
    private boolean time;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();

    public void log(LoggerType type, String text, boolean time) {
        this.type = type;
        this.text = text;
        this.time = time;
        if(time) {
            System.out.println("[" + dtf.format(now) + "]" + type.getPrefix() + text);
        }else {
            System.out.println(type.getPrefix() + text);
        }
    }
}
