package Wzorce.WzorceProjektowe.Day4.TemplateMethod.Before;

public class Main {
    public static void main(String[] args) {
        ApplicationWindowsBuilder appWindow = new ApplicationWindowsBuilder();
        ApplicationLinuxBuidler appLinux = new ApplicationLinuxBuidler();
        appWindow.writeApp();
        appLinux.writeApp();
    }
}
