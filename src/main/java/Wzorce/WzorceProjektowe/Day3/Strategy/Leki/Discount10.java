package Wzorce.WzorceProjektowe.Day3.Strategy.Leki;

public class Discount10 implements Price{
    @Override
    public double cena(double price) {
        return price * 0.9;
    }
}
