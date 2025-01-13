package singleton;

public class SingletonManager {
    private static SingletonManager instance;

    private SingletonManager() {
        System.out.println("SingletonManager oluşturuldu.");
    }

    public static synchronized SingletonManager getInstance() {
        if (instance == null) {
            instance = new SingletonManager();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
