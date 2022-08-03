package Wzorce.WzorceProjektowe.Day3.Observer.StacjaPogodowa;

public class StatisicPanel implements Obserwator, DisplayElement {
    private int maxTemp = 0;
    private int minTemp = 200;
    private int tempSum = 0;
    private int numReading;

    public StatisicPanel(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserwator(this);
    }


    private WeatherData weatherData;


    @Override
    public void show() {
        System.out.println("Średnie / Max / Min temperatury:  "
                + (tempSum / numReading) + "/" + maxTemp + "/" + minTemp);

    }

    @Override
    public void update(int temp, int humidity, int pressure) {
        tempSum += temp;
        numReading++;

        if (temp > maxTemp) {
            maxTemp = temp;

        }
        if (temp < minTemp) {
            minTemp = temp;
        }
        show();

    }

}
