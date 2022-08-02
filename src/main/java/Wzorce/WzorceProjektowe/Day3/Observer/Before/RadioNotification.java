package Wzorce.WzorceProjektowe.Day3.Observer.Before;

public class RadioNotification {
    public void updatePlayer(Player player){
        System.out.println("Radio ");
        System.out.println(player + player.getName());
        System.out.println("Changed status to " + player.getStatus());
    }
}
