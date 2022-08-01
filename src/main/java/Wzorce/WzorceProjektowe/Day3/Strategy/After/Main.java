package Wzorce.WzorceProjektowe.Day3.Strategy.After;

public class Main {
    public static void main(String[] args) {
        Boxer rocky = new Boxer("Juliusz");
        rocky.setPunch(new LeftPunch());
        rocky.hitOtherBoxer();
        rocky.setPunch((new RightPunch()));
        rocky.hitOtherBoxer();
    }
}
