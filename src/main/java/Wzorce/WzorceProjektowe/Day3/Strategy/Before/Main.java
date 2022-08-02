package Wzorce.WzorceProjektowe.Day3.Strategy.Before;

public class Main {
    public static void main(String[] args) {
        Boxer rocky = new Boxer("Rocky");
        System.out.println("Jestem " + rocky.getName());
        rocky.leftPunch();
        rocky.rightPunch();
        rocky.leftPunch();
        rocky.headPunch();
        rocky.rightLegPunch();
        rocky.leftLegPunch();

    }
}
