public class Logger {

    private static Logger instance;

    private static String hello = "=== Siemka! Log: ===";
    private static int i = 0;
    private static int j = 0;


    private Logger() { i++; }

    public static Logger getInstance() {
        j++;
        return SingletonHolder.instance;
        /*
        if (Logger.instance == null) {
            instance = new Logger();
            i++;
        }
        j++;
        return instance;*/
    }

    public void logToConsole() {
        String message = "";
        message += hello + "\n";
        message += "Logger instances: " + i + "\n";
        message += "Logger called: " + j + "\n";
        message += "=== log end ===" + "\n";
        System.out.println(message);
    }

    private static class SingletonHolder {
        private static final Logger instance = new Logger();
    }
}
