package Wzorce.WzorceProjektowe.Day3.Observer.After;

public class Main {
    public static void main(String[] args) {
        Player lewy = new Player("Robert", Status.PASSED);
        TvNotification tv = new TvNotification();
        RadioNotification radio = new RadioNotification();
        lewy.addObserver(tv);
        lewy.addObserver(radio);
        lewy.update(Status.SCORED);
        lewy.update(Status.PASSED);
    }
}
