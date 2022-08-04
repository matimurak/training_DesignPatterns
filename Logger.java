public class Logger {

    private static Logger instance;

    private static String hello = "=== Siemka! Log: ===";
    private static int i = 0;
    private static int j = 0;


    private Logger() {}

    public static Logger getInstance() {
        if (Logger.instance == null) {
            instance = new Logger();
            i++;
        }
        j++;
        return instance;
    }

    public void logToConsole() {
        System.out.println(Logger.hello);
        System.out.println("Instances: " + i);
        System.out.println("Wywolane: " + j);
        System.out.println("=== log end ===");
    }
}
