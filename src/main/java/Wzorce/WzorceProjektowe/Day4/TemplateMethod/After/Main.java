package Wzorce.WzorceProjektowe.Day4.TemplateMethod.After;

public class Main {
    public static void main(String[] args) {
        ApplicationWindowsBuild appWin = new ApplicationWindowsBuild();
        ApplicationLinuxBuild appLin = new ApplicationLinuxBuild();
        appWin.writeApp();
        appLin.writeApp();
    }
}
