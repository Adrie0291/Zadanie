package Wzorce.WzorceProjektowe.Day3.FlyweightPylek.Soldier;

public class StatsValues {
    private int hp;
    private int armor;
    private int speed;
    private int cost;

    public StatsValues(int hp, int armor, int speed, int cost) {
        this.hp = hp;
        this.armor = armor;
        this.speed = speed;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Stats{" +
                "hp=" + hp +
                ", armor=" + armor +
                ", speed=" + speed +
                ", cost=" + cost +
                '}';
    }

}
