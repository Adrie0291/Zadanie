package Wzorce.WzorceProjektowe.Day4.Factory.AbstractFactory.newUnitsFolder;

public class RedArmyFactory extends UnitFactory{
    @Override
    public Alien createAlien(String type) {
        switch (type) {
            case "oxigo":
                return new Oxigo("general", 450);
            case "manot":
                return new Manot("chef", 200);
            default:
                return new Oxigo("pinki", 50);
        }
    }

    @Override
    public Android createAndroid(String type) {
        switch (type) {
            case "T300":
                return new Terminator(30, 40);
            case "T400":
                return new Terminator(90, 130);
            default:
                return new Terminator(230, 10);

        }
    }
}