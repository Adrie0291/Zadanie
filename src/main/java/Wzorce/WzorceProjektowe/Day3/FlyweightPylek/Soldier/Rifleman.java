package Wzorce.WzorceProjektowe.Day3.FlyweightPylek.Soldier;

public class Rifleman extends Military {
    public Rifleman(String location) {
        super(location, Stats.getRifleman());
    }
}
