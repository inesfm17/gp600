package Lab05.V1;

// Serve para utilizar estes metodos para criar veiculos conforme necessario, é especificado pela nossa main dada 
public class VehicleFactory {
    public static Motociclo createMotociclo(String matricula, String marca, String modelo, int potencia, String tipo) {
        return new Motociclo(matricula, marca, modelo, potencia, tipo);
    }

    public static AutomovelLigeiro createAutomovelLigeiro(String matricula, String marca, String modelo, int potencia, String numQuadro, int capacBagageira) {
        return new AutomovelLigeiro(matricula, marca, modelo, potencia, numQuadro, capacBagageira);
    }

    public static Taxi createTaxi(String matricula, String marca, String modelo, int potencia, String numQuadro, int capacBagageira, String numLicenca) {
        return new Taxi(matricula, marca, modelo, potencia, numQuadro, capacBagageira, numLicenca);
    }

    public static PPEletrico createPPEletrico(String matricula, String marca, String modelo, int potencia, int autonomiaMaxima, String numQuadro, int capacidadeBateria, int tempoCarregamento, int cargaMaxima) {
        return new PPEletrico(matricula, marca, modelo, potencia, autonomiaMaxima, numQuadro, capacidadeBateria, tempoCarregamento, cargaMaxima);
    }

    public static ALEletrico createALEletrico(String matricula, String marca, String modelo, int potencia, String numQuadro, int capacidadeCarga, int autonomia, int tempoCarga) {
        return new ALEletrico(matricula, marca, modelo, potencia, numQuadro, capacidadeCarga, autonomia, tempoCarga);
    }

    public static PesadoMercadorias createPesadoMercadorias(String matricula, String marca, String modelo, int potencia, String numQuadro, int peso, int cargaMaxima) {
        return new PesadoMercadorias(matricula, marca, modelo, potencia, numQuadro, peso, cargaMaxima);
    }

    public static PesadoPassageiros createPesadoPassageiros(String matricula, String marca, String modelo, int potencia, int peso, String numQuadro, int maxPassageiros) {
        return new PesadoPassageiros(matricula, marca, modelo, potencia, numQuadro, peso, maxPassageiros);
    }
}
