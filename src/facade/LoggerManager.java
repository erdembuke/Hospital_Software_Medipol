package facade;

import singleton.SingletonManager;

public class LoggerManager {
    private final SingletonManager logger;

    public LoggerManager() {
        this.logger = SingletonManager.getInstance();
    }

    public void log(String message) {
        logger.log(message);
    }
}
