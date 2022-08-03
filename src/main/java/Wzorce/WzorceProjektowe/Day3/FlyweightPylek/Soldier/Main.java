package Wzorce.WzorceProjektowe.Day3.FlyweightPylek.Soldier;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Military> militaryList = new ArrayList<>();
        militaryList.add(new Tank("A42"));

        militaryList.add(new Rifleman("C93"));
        militaryList.add(new Destroyer("L201"));
        System.out.println(militaryList);
    }
}
