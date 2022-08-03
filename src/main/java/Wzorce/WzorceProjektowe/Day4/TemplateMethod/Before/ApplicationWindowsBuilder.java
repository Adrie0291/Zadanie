package Wzorce.WzorceProjektowe.Day4.TemplateMethod.Before;

public class ApplicationWindowsBuilder {
    public void writeApp() {
        openSystem();
        installIDE();
        restartSystem();
        runIDE();
    }

    private void openSystem() {
        System.out.println("System opened");
    }

    private void installIDE() {
        System.out.println("IDE installed");
    }

    private void restartSystem() {
        System.out.println("System restarded");
    }

    private void runIDE() {
        System.out.println("IDE ran");
    }
}


