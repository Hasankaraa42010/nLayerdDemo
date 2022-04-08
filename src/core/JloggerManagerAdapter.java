package core;

import jLogger.JLoggerManager;

public class JloggerManagerAdapter implements LoggerService{
    @Override
    public void loggedToDatabase(String message) {
        JLoggerManager jLoggerManager=new JLoggerManager();
        jLoggerManager.log(message);
    }
}
