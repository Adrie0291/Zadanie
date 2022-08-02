package Wzorce.WzorceProjektowe.Day3.Observer.After;

public class TvNotification implements Observer{
    @Override
    public void update(Player player) {
        System.out.println("TV Info:");
        System.out.println("Player " + player + "changes status to: " + player.getStatus());

    }
}
