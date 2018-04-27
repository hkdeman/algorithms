public class StatisticsDisplay extends WeatherData implements Observer{
    @Override
    public void update() {
        System.out.println("Tomorrow's Temperature "+ getNextDayTemperature());
        System.out.println("Tomorrow's Pressure "+ getNextDayPressure());
        System.out.println("Tomorrow's Humidity "+ getNextDayHumidity());        
        System.out.println("-----------------------------------");
        System.out.println("Temperature "+ getTemperature());
        System.out.println("Pressure "+ getPressure());
        System.out.println("Humidity "+ getHumidity());
        System.out.println();
        System.out.println();                        
    }
}