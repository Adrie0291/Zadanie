package Wzorce.WzorceProjektowe.Day2.Builder.After;


public class main {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder()
                .buildProcessor("Intel")
                .buildRam("16GB")
                .buildGraphic("Radeon")
                .build();
        System.out.println(computer.toString());
    }
}
