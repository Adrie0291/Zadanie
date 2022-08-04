package Wzorce.WzorceProjektowe.Day4.TemplateMethod.After.ShopComp;

import java.util.Map;

public class Computer {
    private Map<Part, Type> elements;

    public Computer(Map<Part, Type> elements) {
        this.elements = elements;
    }

    public Map<Part, Type> getElements() {
        return elements;
    }
}
