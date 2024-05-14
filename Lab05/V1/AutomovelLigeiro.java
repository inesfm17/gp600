package Lab05.V1;

public class AutomovelLigeiro extends Veiculo {
    private String numQuadro;
    private int capacBagageira;

    AutomovelLigeiro(String matricula, String marca, String modelo, int potencia, String numQuadro, int capacBagageira){
        super(matricula, marca, modelo, potencia);
        this.capacBagageira = capacBagageira;
        this.numQuadro=numQuadro;
    }

    public int getCapacBagageira() {
        return capacBagageira;
    }
    public void setCapacBagageira(int capacBagageira) {
        this.capacBagageira = capacBagageira;
    }
    public String getNumQuadro() {
        return numQuadro;
    }
    public void setNumQuadro(String numQuadro) {
        this.numQuadro = numQuadro;
    }

    public String toString() {
        return "Automovel Ligeiro: " + this.numQuadro + " " + this.capacBagageira + " ," + super.toString();
    }
    public boolean equals(Object obj) {
        return super.equals(obj) && getClass() == obj.getClass() && this.numQuadro == ((AutomovelLigeiro) obj).getNumQuadro() && this.capacBagageira == ((AutomovelLigeiro) obj).getCapacBagageira();
    }
}