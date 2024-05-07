package Lab05.V2;

public class Milk implements Portion {
    private State state = State.LIQUID; 
    private Temperature temperature = Temperature.WARM; 

    public State getState(){
        return state; 
    }

    public Temperature getTemperature(){
        return temperature;
    }

    public String toString(){
        return String.format("%s: Temperature %s, State %s", this.getClass().getSimpleName(), getTemperature().name(), getState().name());
    }
}
