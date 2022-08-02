package Wzorce.WzorceProjektowe.Day3.Strategy.Before;

public class Boxer {
    private String name;

    public Boxer(String name) {
        this.name = name;
    }

    public void leftPunch() {
        System.out.println("Hitting with left punch");
    }

    public void rightPunch() {
        System.out.println("Hitting with right punch");

    }

    public void headPunch() {
        System.out.println("Hitting with head");
    }

    public void leftLegPunch() {
        System.out.println("Hitting with left leg");
    }

    public void rightLegPunch() {
        System.out.println("Hitting with right leg");
    }

    public String getName() {
        return name;
    }
}
