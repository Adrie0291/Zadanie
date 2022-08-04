package Wzorce.WzorceProjektowe.Day4.TemplateMethod.Before;

public class ApplicationLinuxBuidler {
    public void writeApp() {
        openSystem();
        installIDE();
        runIDE();
    }

    private void openSystem() {
        System.out.println("PResses power button. Your OS is starting");
    }

    private void installIDE() {
        System.out.println("apt-get install idea");
    }

    private void runIDE() {
        System.out.println("./idea/run.sh");
    }
}
