package Wzorce.WzorceProjektowe.Day4.Factory.After.units;

public class AlienFactory extends UnitFactory {

    @Override
    public Alien create(String type) {
        switch (type) {
            case "secton":
                return new Secton("lider", 300);
            case "muto":
                return new Muto("soldier", 100);
            default:
                return new Secton("soldier-secton", 100);
        }
    }
}
