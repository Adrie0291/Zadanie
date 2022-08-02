package Wzorce.WzorceProjektowe.Day3.Observer.After;

public interface Obeserwable {
    void addObserver (Observer observer);
    void removeObserver(Observer observer);
    void notifyAllObserver();
}
