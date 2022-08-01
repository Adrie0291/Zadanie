package Wzorce.WzorceProjektowe.Day3.Strategy.After;

public class Boxer {
    private String name;
    private Punch punch;

    public Boxer(String name) {
        this.name = name;
    }

    public void setPunch(Punch punch) {
        this.punch = punch;
    }

    public void hitOtherBoxer() {
        punch.hit();
    }
}
