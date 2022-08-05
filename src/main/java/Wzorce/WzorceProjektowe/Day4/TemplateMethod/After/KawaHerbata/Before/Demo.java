package Wzorce.WzorceProjektowe.Day4.TemplateMethod.After.KawaHerbata.Before;

public class Demo {
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.recepturaParzenia();
        Coffee coffee = new Coffee();
        coffee.recepturaParzenia();
    }
}
