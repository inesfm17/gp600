package Lab05.V2;

public class FruitJuice implements Portion {
    private String FruitName;
    private Temperature temperature = Temperature.COLD; 
    private State state = State.LIQUID;

    protected FruitJuice(String FruitName){
        this.FruitName = FruitName;
    }
    
    public String getFruitName(){
        return FruitName;
    }

    public Temperature getTemperature(){
        return temperature;
    }

    public State getState(){
        return state;
    }

    public String toString(){
        return String.format("%s: %s, Temperature %s, State %s", this.getClass().getSimpleName(), getFruitName(), getTemperature().name(), getState().name());
    }

}
