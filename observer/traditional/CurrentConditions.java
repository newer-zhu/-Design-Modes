package observer.traditional;

public class CurrentConditions {
    private float temperature;
    private float pressure;
    private float humidity;

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
