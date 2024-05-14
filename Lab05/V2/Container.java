package Lab05.V2;

// Representa um recipiente para armazenar uma porção
public class Container {
    private Portion portion;
    // Cria um Container com base na Portion fornecida
    public static Container create(Portion portion) {
        if (portion == null) {
            return null;
        }
        Container container;
        // Verifica o estado e a temperatura da porção para determinar o tipo de recipiente adequado
        if (portion.getState() == State.LIQUID) {
            if (portion.getTemperature() == Temperature.COLD) {
                container = new PlasticBottle();
                container.setPortion(portion);
                return container;
            } else if (portion.getTemperature() == Temperature.WARM) {
                container = new TermicBottle();
                container.setPortion(portion);
                return container;
            }
        } else if (portion.getState() == State.SOLID) {
            if (portion.getTemperature() == Temperature.COLD) {
                container = new PlasticBag();
                container.setPortion(portion);
                return container;
            } else if (portion.getTemperature() == Temperature.WARM) {
                container = new Tupperware();
                container.setPortion(portion);
                return container;
            }
        }
        return null;
    }

    public void setPortion(Portion p) {
        portion = p;
    }

    public String toString() {
        return String.format("%s with portion = %s", this.getClass().getSimpleName(), portion);
    }

}