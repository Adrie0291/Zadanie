package Wzorce.WzorceProjektowe.Day3.FlyweightPylek.After;

public class Car {
    private int mileage;
    private ColorValues colorValues;
    public Car(int mileage, String color) {
        this.mileage = mileage;
        switch (color) {
            case "black":
                this.colorValues = Color.getBlack();
                break;
            case "white":
                this.colorValues = Color.getWhite();
                break;
            case "yellow":
                this.colorValues = Color.getYellow();
                break;
            default:
                this.colorValues = Color.getGreen();

        }
    }
    @Override
    public String toString() {
        return "Car{" +
                "mileage=" + mileage +
                ", color=" + colorValues +
                '}';


    }
}
