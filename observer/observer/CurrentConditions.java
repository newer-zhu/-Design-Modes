package observer.observer;

public class CurrentConditions implements Observer{
    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature,float pressure, float humidity){
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        display();
    }

    public void display(){
        System.out.println("***Today temperature: "+temperature+"***");
        System.out.println("***Today pressure: "+pressure+"***");
        System.out.println("***Today humidity: "+humidity+"***");
    }


}
