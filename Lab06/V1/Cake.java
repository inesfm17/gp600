package Lab06.V1;

public class Cake {
    private Shape shape; // Formato do bolo
    private String cakeLayer; // Tipo de bolo
    private int numCakeLayers; // Número de camadas do bolo
    private Cream addCreamLayer; // Creme da camada do meio
    private Cream topLayerCream; // Creme da camada superior
    private Topping topping; // Cobertura do bolo
    private String message; // Mensagem escrita no bolo

    // Construtor da classe Cake
    public Cake(String cakeLayer) {
        this.numCakeLayers = 0; // Inicializa o número de camadas como 0
        this.cakeLayer = cakeLayer; // Define o tipo de bolo
    }

    @Override
    public String toString() {
        return String.format("%s cake with %d layers, topped with %s and %s. Message says: %s",
                cakeLayer, numCakeLayers, topLayerCream, topping, message);
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void addTopping(Topping topping) {
        this.topping = topping;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void addCreamLayer(Cream addCreamLayer) {
        this.addCreamLayer = addCreamLayer;
    }

    public void addTopLayer(Cream topLayerCream) {
        this.topLayerCream = topLayerCream;
    }

    public void addCakeLayer() {
        this.numCakeLayers += 1; // Incrementa o número de camadas do bolo
    }
}