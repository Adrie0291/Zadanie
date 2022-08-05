package Wzorce.WzorceProjektowe.Day4.TemplateMethod.After;

public class ApplicationLinuxBuild extends ApplicationBuilder {
    @Override
    void installIde() {
        System.out.println("apt-get install idea LINUX ");
    }

    @Override
    void runIDE() {
        System.out.println("./idea/run.sh LINUX");
    }

    @Override
    void restart() {
    }

}

