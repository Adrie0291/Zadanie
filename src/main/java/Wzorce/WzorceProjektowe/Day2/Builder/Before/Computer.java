package Wzorce.WzorceProjektowe.Day2.Builder.Before;

public class Computer {
    private String processor;
    private String ram;
    private String graphic;


    public Computer(String processor, String ram, String graphic, String mainboard) {
        this.processor = processor;
        this.ram = ram;
        this.graphic = graphic;

    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphic='" + graphic + '\'' +
                '}';
    }
}