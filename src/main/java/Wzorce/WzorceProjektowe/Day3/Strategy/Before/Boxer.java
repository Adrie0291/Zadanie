package Wzorce.WzorceProjektowe.Day3.Strategy.Before;

public class Boxer {
    private String name;

    public Boxer(String name) {
        this.name = name;
    }
    public void leftPunch(){
        System.out.println("Hitting with left punch");
    }
    public void rightPunch(){
        System.out.println("Hitting with right punch");

    }

    public String getName() {
        return name;
    }
}
