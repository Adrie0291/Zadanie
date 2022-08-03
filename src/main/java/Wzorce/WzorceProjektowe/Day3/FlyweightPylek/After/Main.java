package Wzorce.WzorceProjektowe.Day3.FlyweightPylek.After;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(new BlackDodge(10000));
        }
        System.out.println(list.get(1));

        List<Object> list2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list2.add(new WhitePorsche(39000));
        }
        System.out.println(list2);
    }

}
