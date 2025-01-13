package facade;

import observer.Notifier;

public class NotifierManager {
    private final Notifier notifier;

    public NotifierManager() {
        this.notifier = new Notifier();
    }

    public void addObserverToNotifier(observer.Observer observer) {
        notifier.addObserver(observer);
    }

    public void notifyObservers(String message) {
        notifier.notifyObservers(message);
    }
}
