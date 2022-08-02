package Wzorce.WzorceProjektowe.Day3.Observer.Before;

public class Main {
    public static void main(String[] args) {
        Player lewy = new Player("Lewandowski", Status.IDLE);
        System.out.println("Beginning of the game");
        TvNotification tv = new TvNotification();
        RadioNotification radio = new RadioNotification();
        lewy.setStatus(Status.PASSED);
        tv.updatePlayer(lewy);
        radio.updatePlayer(lewy);

        lewy.setStatus(Status.SCORED);
        tv.updatePlayer(lewy);
        radio.updatePlayer(lewy);


    }
}
