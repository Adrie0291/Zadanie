package Wzorce.WzorceProjektowe.Day4.TemplateMethod.After.ShopComp;

public class EconomicComputer extends ComputerBuilder {


    @Override
    protected void addProcessor() {
        elements.put(Part.PROCESSOR, Type.ECONOMIC);

    }

    @Override
    protected void addMotherBoard() {
        elements.put(Part.MOTHERBOARD, Type.ECONOMIC);
    }

    @Override
    protected void addRam() {
        elements.put(Part.MEMORY, Type.ECONOMIC);

    }
}
