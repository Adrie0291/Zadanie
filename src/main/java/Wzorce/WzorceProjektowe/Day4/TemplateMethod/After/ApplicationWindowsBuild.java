package Wzorce.WzorceProjektowe.Day4.TemplateMethod.After;

public class ApplicationWindowsBuild extends ApplicationBuilder {
    @Override
    void installIde() {
        System.out.println("Switch program in control panel");

    }

    @Override
    void runIDE() {
        System.out.println("Double click on shortcut");

    }
    @Override
    void restart(){
        System.out.println("Reset w Windows ");
    }
}