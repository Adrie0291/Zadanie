package Wzorce.WzorceProjektowe.Day4.TemplateMethod.After.ShopComp;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder richComp = new RichComputer();
        richComp.build();
        System.out.println(richComp);
    }
}
