package Wzorce.WzorceProjektowe.Day4.Factory.AbstractFactory;

import Wzorce.WzorceProjektowe.Day4.Factory.AbstractFactory.newUnitsFolder.BlueArmyFactory;
import Wzorce.WzorceProjektowe.Day4.Factory.AbstractFactory.newUnitsFolder.RedArmyFactory;
import Wzorce.WzorceProjektowe.Day4.Factory.AbstractFactory.newUnitsFolder.UnitFactory;

public class Main {
    public static void main(String[] args) {
        UnitFactory redArmyFactory = new RedArmyFactory();
        UnitFactory blueArmyFactory = new BlueArmyFactory();

        System.out.println(blueArmyFactory.createAndroid("T300"));
        System.out.println(blueArmyFactory.createAlien("oxigo"));
        System.out.println("------------");
        System.out.println(redArmyFactory.createAndroid("T400"));
        System.out.println(redArmyFactory.createAlien("manot"));


    }
}
