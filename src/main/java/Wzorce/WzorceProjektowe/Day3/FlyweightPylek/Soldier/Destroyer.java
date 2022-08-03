package Wzorce.WzorceProjektowe.Day3.FlyweightPylek.Soldier;

public class Destroyer extends Military {

    public Destroyer(String location) {
        super(location, Stats.getDestroey());
    }
}
