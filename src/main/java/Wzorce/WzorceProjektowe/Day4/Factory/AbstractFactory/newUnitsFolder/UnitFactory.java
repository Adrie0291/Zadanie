package Wzorce.WzorceProjektowe.Day4.Factory.AbstractFactory.newUnitsFolder;

public abstract class UnitFactory {
    abstract public Alien createAlien(String type);
    abstract public Android createAndroid(String type);
}
