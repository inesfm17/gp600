package Lab06.V1;

// Coordena a criação de um bolo usando o padrão Builder
public class CakeMaster {
    // Referência para o construtor de bolo
    CakeBuilder cakeBuilder;

    public void setCakeBuilder(CakeBuilder cakeBuilder){
        this.cakeBuilder = cakeBuilder;
    }

    public void createCake(String message){
        createCake(1, message);
    }

    // Método para criar um bolo com um número específico de camadas e uma mensagem
    public void createCake(int numLayers, String message){
        this.cakeBuilder.createCake();
        for(int i=0; i<numLayers; i++){
            this.cakeBuilder.addCakeLayer();
            this.cakeBuilder.addCreamLayer();
        }
        this.cakeBuilder.addTopLayer();
        this.cakeBuilder.addTopping();
        this.cakeBuilder.addMessage(message);
    }

    public void createCake(Shape shape, int numLayers, String message){
        createCake(numLayers, message);
        this.cakeBuilder.setCakeShape(shape);
    }

    // Método para obter o bolo criado
    public Cake getCake(){
        return this.cakeBuilder.getCake();
    }
}
