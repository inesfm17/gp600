package Lab05.V2;

// Responsável pela criação de porções com base no tipo de refeição e temperatura
public class PortionFactory {
    public static Portion create(String mealType, Temperature temp) {
        Portion p = null;
        // Verifica o tipo de refeição
        // Se for uma bebida
        if (mealType.equalsIgnoreCase("Beverage")) {
            if (temp == Temperature.COLD) {
                p = new FruitJuice("Orange");
            } else if (temp == Temperature.WARM) {
                p = new Milk();
            }
        // Se for uma refeição sólida 
        } else {
            if (temp == Temperature.COLD) {
                p = new Tuna();
            } else {
                // fall back
                p = new Pork();
            }
        }
        return p;
    }
}
