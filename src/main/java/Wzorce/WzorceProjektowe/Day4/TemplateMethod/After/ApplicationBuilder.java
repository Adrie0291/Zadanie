package Wzorce.WzorceProjektowe.Day4.TemplateMethod.After;

public abstract class ApplicationBuilder {
    public void writeApp() {
        openSystem();
        installIde();
        runIDE();
        restart();
    }

    public void openSystem() {
        System.out.println("Pressed power button. Your OS is starting");
    }

    abstract void installIde();

    abstract void runIDE();
    abstract void restart();
}

