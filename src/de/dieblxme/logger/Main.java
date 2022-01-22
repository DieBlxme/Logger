package de.dieblxme.logger;

public class Main {
    static Logger logger = new Logger();

    public static void main(String[] args) {
        logger.log(LoggerType.WARNING, "Test", true);
    }
}
