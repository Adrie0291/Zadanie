package Wzorce.WzorceProjektowe.Day3.FlyweightPylek.Soldier;

public class Military {
    private String location;
    private StatsValues stats;

    public Military(String location, StatsValues stats) {
        this.location = location;
        this.stats = stats;
    }

    @Override
    public String toString() {
        return "WarCar{" +
                "location='" + location + '\'' +
                ", stats=" + stats + "\n" +
                '}';
    }
}
