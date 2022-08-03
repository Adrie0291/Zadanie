package Wzorce.WzorceProjektowe.Day3.Observer.StacjaPogodowa;

public class ForecastPanel implements Obserwator, DisplayElement {
    private int currentPressure = 30;
    private int lastPressure;
    private WeatherData weatherData;

    public ForecastPanel(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserwator(this);
    }

    public void update(int temp, int humidity, int pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        show();
    }

    public void show() {
        System.out.println("Prognoza ");
        if (currentPressure > lastPressure) {
            System.out.println("Cisnienie wzrosło");
        } else if (currentPressure == lastPressure) {
            System.out.println("Ciśnienie jest takie samo ");
        } else if (currentPressure < lastPressure) {
            System.out.println("Ciśnienie zmalało");
        }
    }
}
