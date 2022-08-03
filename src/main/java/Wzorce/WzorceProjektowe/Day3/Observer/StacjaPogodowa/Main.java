package Wzorce.WzorceProjektowe.Day3.Observer.StacjaPogodowa;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsPanel currentConditionsPanel
                = new CurrentConditionsPanel(weatherData);
        StatisicPanel statisicPanel = new StatisicPanel(weatherData);
        ForecastPanel forecastPanel = new ForecastPanel(weatherData);
        System.out.println("Ciśnienie bazowe: 30");
        weatherData.setDataWeather(90, 10, 20);
        weatherData.setDataWeather(-30, 700, 35);
        weatherData.setDataWeather(10, 1450, 40);

    }
}