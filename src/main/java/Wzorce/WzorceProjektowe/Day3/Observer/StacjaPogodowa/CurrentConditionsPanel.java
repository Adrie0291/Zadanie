package Wzorce.WzorceProjektowe.Day3.Observer.StacjaPogodowa;

public class CurrentConditionsPanel implements Obserwator, DisplayElement {
    private int temp;
    private int humidity;
    private int pressure;
    private WeatherData weatherData;

    public CurrentConditionsPanel(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserwator(this);
    }


    @Override
    public void show() {
        System.out.println("Warunki bieżące: " + temp + "  °C oraz wilgotność: " + humidity + " i ciśnienie: " + pressure);
    }

    @Override
    public void update(int temp, int humidity, int pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        show();

    }
}
