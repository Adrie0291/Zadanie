package Wzorce.WzorceProjektowe.Day4.TemplateMethod.After.ShopComp;

import java.util.HashMap;
import java.util.Map;

public abstract class ComputerBuilder {
    protected Map<Part, Type> elements = new HashMap<>();

    public Computer build() {
        addCharger();
        addProcessor();
        addMotherBoard();
        addRam();
        return new Computer(elements);

    }

    private void addCharger() {
        System.out.println("Charger has been added");
    }

    protected abstract void addProcessor();

    protected abstract void addMotherBoard();

    protected abstract void addRam();

    @Override
    public String toString() {
        return "ComputerBuilder{" +
                "elements=" + elements +
                '}';
    }
}
