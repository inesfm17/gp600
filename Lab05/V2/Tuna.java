package Lab05.V2;

public class Tuna implements Portion {
    private State state = State.SOLID;
    private Temperature temperature = Temperature.COLD; 

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
