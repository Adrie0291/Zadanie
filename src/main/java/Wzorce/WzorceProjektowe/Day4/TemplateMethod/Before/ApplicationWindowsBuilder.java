package Wzorce.WzorceProjektowe.Day4.TemplateMethod.Before;

public class ApplicationWindowsBuilder {
    public void writeApp() {
        openSystem();
        installIDE();
        restartSystem();
        runIDE();
    }

    private void openSystem() {
        System.out.println("Press power button. Your OS is starting");
    }

    private void installIDE() {
        System.out.println("Switch rpogram in control panel");
    }

    private void restartSystem() {
        System.out.println("System restarted");
    }

    private void runIDE() {
        System.out.println("Double click on shortcut ");
    }
}


