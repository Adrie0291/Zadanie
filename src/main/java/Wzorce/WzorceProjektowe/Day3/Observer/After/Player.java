package Wzorce.WzorceProjektowe.Day3.Observer.After;

import java.util.ArrayList;
import java.util.List;

public class Player implements Obeserwable {
    private List<Observer> observerList = new ArrayList<>();
    private String name;
    private Status status;

    public Player(String name, Status status) {
        this.name = name;
        this.status = status;
    }
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);

    }
    @Override
    public void notifyAllObserver() {
        for (Observer observer : observerList) {
            observer.update(this);
        }
    }
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }
    public void update(Status status) {
        setStatus(status);
        notifyAllObserver();
    }
}