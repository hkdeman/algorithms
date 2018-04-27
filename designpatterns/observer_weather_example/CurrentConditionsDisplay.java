public class CurrentConditionsDisplay extends WeatherData implements Observer{
    @Override
    public void update() {
        System.out.println("Temperature "+ getTemperature());
        System.out.println("Pressure "+ getPressure());
        System.out.println("Humidity "+ getHumidity());    
        System.out.println();        
        System.out.println();        
            
    }
}