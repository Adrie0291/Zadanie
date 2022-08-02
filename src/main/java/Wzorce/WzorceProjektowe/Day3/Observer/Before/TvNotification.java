package Wzorce.WzorceProjektowe.Day3.Observer.Before;

public class TvNotification {
    public void updatePlayer(Player player){
        System.out.println("TV:  ");
        System.out.println(player + player.getName());
        System.out.println("Changed status to " + player.getStatus());
    }
}
