package Wzorce.WzorceProjektowe.Day4.Factory.AbstractFactory.newUnitsFolder;

public class Android {
    private int version;
    private int stamina;

    public Android(int version, int stamina) {
        this.version = version;
        this.stamina = stamina;
    }

    @Override
    public String toString() {
        return "Android{" +
                "version=" + version +
                ", stamina=" + stamina +
                '}';
    }
}
