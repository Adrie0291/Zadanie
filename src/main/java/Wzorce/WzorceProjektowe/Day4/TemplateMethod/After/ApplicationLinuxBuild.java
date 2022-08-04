package Wzorce.WzorceProjektowe.Day4.TemplateMethod.After;

public class ApplicationLinuxBuild extends ApplicationBuilder {
    @Override
    void installIde() {
        System.out.println("apt-get install idea");
    }

    @Override
    void runIDE() {
        System.out.println("./idea/run.sh");
    }

    @Override
    void restart() {

    }
}
