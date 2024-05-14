package Lab05.V1;

abstract public class Veiculo implements KmPercorridosInterface {
    

    private String matricula;
    private String marca;
    private String modelo;
    private int potencia; // cv
    private int kmPercorridos;
    private int ultimoTrajeto;

    Veiculo(String matricula, String marca, String modelo, int potencia){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.kmPercorridos = 0;
        this.ultimoTrajeto = 0;
    }

    public int distanciaTotal() {
        return this.kmPercorridos;
    }

    @Override
    public void trajeto(int quilometros) {
        this.kmPercorridos += quilometros;
        this.ultimoTrajeto = quilometros;
    }

    public int ultimoTrajeto() {
        return this.ultimoTrajeto;
    }
   
    
    public String getMatricula() {
        return matricula;
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String toString() {
        return String.format("Viatura: %s %s %s %dcv", this.matricula, this.marca, this.modelo, this.potencia);
    }
}