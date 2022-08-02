package Wzorce.WzorceProjektowe.Day3.Observer.After;

public class RadioNotification implements Observer {
    @Override
    public void update(Player player) {
        System.out.println("Radio:");
        System.out.println("Player " + player + "changes status to: " + player.getStatus());

    }
}
