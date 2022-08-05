package Wzorce.WzorceProjektowe.Day4.TemplateMethod.After;

public class ApplicationWindowsBuild extends ApplicationBuilder {
    @Override
    void installIde() {
        System.out.println("Switch program in control panel WINDOWS");

    }

    @Override
    void runIDE() {
        System.out.println("Double click on shortcut WINDOWS ");

    }
    @Override
    void restart(){
        System.out.println("Reset w Windows WINDOWS");
    }
}