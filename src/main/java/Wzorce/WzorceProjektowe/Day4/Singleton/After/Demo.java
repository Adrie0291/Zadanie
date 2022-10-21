package Wzorce.WzorceProjektowe.Day4.Singleton.After;


public class Demo {
    public static void main(String[] args) {
        Civil game1 = Civil.getGame();
        Civil game2 = Civil.getGame();
        System.out.println(game1.equals(game2));
    }
}
