package Wzorce.WzorceProjektowe.Day3.FlyweightPylek.Soldier;

public class Tank extends Military {
    public Tank(String location) {
        super(location, Stats.getTank());
    }
}
