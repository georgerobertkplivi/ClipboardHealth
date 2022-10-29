package utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerLoad {
    private static Logger logger = LogManager.getLogger();

    public static void info(String msg){
        logger.info(msg);
    }

    public static void warn(String msg){
        logger.warn(msg);
    }

    public static void error(String msg){
        logger.error(msg);
    }

    public static void fatal(String msg){
        logger.fatal(msg);
    }

    public static void debug(String msg){
        logger.debug(msg);
    }

}
