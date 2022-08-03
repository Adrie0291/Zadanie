package Wzorce.WzorceProjektowe.Day3.FlyweightPylek.After;

public class ColorValues {
    private int red;
    private int green;
    private int blue;

    public ColorValues(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    @Override
    public String toString() {
        return "Color{" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                '}';
    }
}
