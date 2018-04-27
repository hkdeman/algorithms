public class WeatherData extends Subject{
    float temperature = 10;
    float pressure = 800;
    float humidity = 10;

    float nextDayTemperature = 12;
    float nextDayPressure = 802;
    float nextDayHumidity = 11;
    

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

   /**
    * @return the nextDayTemperature
    */
   public float getNextDayTemperature() {
       return nextDayTemperature;
   }

    /**
     * @return the nextDayHumidity
     */
    public float getNextDayHumidity() {
        return nextDayHumidity;
    }

    /**
     * @return the nextDayPressure
     */
    public float getNextDayPressure() {
        return nextDayPressure;
    }

}