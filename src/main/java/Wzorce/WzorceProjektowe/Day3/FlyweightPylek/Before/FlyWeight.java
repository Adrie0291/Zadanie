package Wzorce.WzorceProjektowe.Day3.FlyweightPylek.Before;

import java.util.ArrayList;
import java.util.List;

public class FlyWeight {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(new BlackDodge(1000, 0, 0, 0));
        }
        BlackDodge blackDodge = new BlackDodge(50, 0, 0, 0);
    }
}
