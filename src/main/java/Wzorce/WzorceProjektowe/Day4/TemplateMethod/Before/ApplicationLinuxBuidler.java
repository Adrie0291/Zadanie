package Wzorce.WzorceProjektowe.Day4.TemplateMethod.Before;

public class ApplicationLinuxBuidler {
    public void writeApp() {
        openSystem();
        installIDE();
        runIDE();
    }

    private void openSystem() {
        System.out.println("System opened");
    }

    private void installIDE() {
        System.out.println("IDE installed");
    }

    private void runIDE() {
        System.out.println("IDE ran");
    }
}
