package Wzorce.WzorceProjektowe.Day4.TemplateMethod.After.ShopComp;

public class RichComputer extends ComputerBuilder {


    @Override
    protected void addProcessor() {
        elements.put(Part.PROCESSOR, Type.RICH);

    }

    @Override
    protected void addMotherBoard() {
        elements.put(Part.MOTHERBOARD, Type.RICH);

    }

    @Override
    protected void addRam() {
        elements.put(Part.MEMORY, Type.ECONOMIC);

    }
}
