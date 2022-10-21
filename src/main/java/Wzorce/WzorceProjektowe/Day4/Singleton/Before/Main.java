package Wzorce.WzorceProjektowe.Day4.Singleton.Before;

import Wzorce.WzorceProjektowe.Day4.Singleton.Before.Civilazation;

public class Main {
    public static void main(String[] args) {
        Civilazation game1 = new Civilazation();
        Civilazation game2 = new Civilazation();
        System.out.println(game1.equals(game2));
    }
}
