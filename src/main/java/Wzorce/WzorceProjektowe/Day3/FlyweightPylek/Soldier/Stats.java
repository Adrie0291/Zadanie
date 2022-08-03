package Wzorce.WzorceProjektowe.Day3.FlyweightPylek.Soldier;

public class Stats {
    private static StatsValues tank = new StatsValues(100, 100, 80, 90000);
    private static StatsValues rifleman = new StatsValues(50, 60, 5, 10000);
    private static StatsValues destroey = new StatsValues(200, 300, 150, 2000000);

    public static StatsValues getTank() {
        return tank;
    }

    public static StatsValues getRifleman() {
        return rifleman;
    }

    public static StatsValues getDestroey() {
        return destroey;
    }

}
