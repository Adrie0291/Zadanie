package Wzorce.WzorceProjektowe.Day3.FlyweightPylek.After;

public class Color {
    private static ColorValues white = new ColorValues(255, 255, 255);
    private static ColorValues black = new ColorValues(0, 0, 0);
    private static ColorValues yellow = new ColorValues(255, 255, 0);
    private static ColorValues red = new ColorValues(255, 0, 0);
    private static ColorValues blue = new ColorValues(0, 0, 255);
    private static ColorValues green = new ColorValues(0, 255, 0);

    public static ColorValues getWhite() {
        return white;
    }

    public static ColorValues getBlack() {
        return black;
    }

    public static ColorValues getYellow() {
        return yellow;
    }

    public static ColorValues getRed() {
        return red;
    }

    public static ColorValues getBlue() {
        return blue;
    }

    public static ColorValues getGreen() {
        return green;
    }

}
