public class Test {
    public static void main(String[] args) {
        Observer observer1 = new CurrentConditionsDisplay();
        Observer observer2 = new ForecastDisplay();
        Observer observer3 = new StatisticsDisplay();

        WeatherData weatherData = new WeatherData();

        weatherData.add(observer1);
        weatherData.add(observer2);
        weatherData.add(observer3);    

        System.out.println("*********************************");
        
        weatherData.notifyObservers();
        
        weatherData.remove(observer1);

        System.out.println("*********************************");

        weatherData.notifyObservers();
    }
}