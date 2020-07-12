package observer.observer;

public interface Subject {
    public void registerObserver(Observer b);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
