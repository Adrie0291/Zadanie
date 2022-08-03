package Wzorce.WzorceProjektowe.Day3.Observer.StacjaPogodowa;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Podmiot {
    private List<Obserwator> obserwators;
    private int temp;
    private int humidity;
    private int pressure;

    public WeatherData() {
        obserwators = new ArrayList<>();
    }

    public void addObserwator(Obserwator obserwator) {
        obserwators.add(obserwator);
    }

    public void removeObserwator(Obserwator obserwator) {
        obserwators.remove(obserwator);
    }

    public void updateObserwator() {
        for (Obserwator obserwator : obserwators) {
            obserwator.update(temp, humidity, pressure);

        }
    }

    public void changedDataWeather() {
        updateObserwator();
    }

    public void setDataWeather(int temp, int humidity, int pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        changedDataWeather();
    }
}
