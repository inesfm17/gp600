package Lab05.V1;

public class AutomovelLigeiro extends Veiculo {
    private int numQuadro;
    private int capacBagageira;

    AutomovelLigeiro(String matricula, String marca, String modelo, int potencia, String numQuadro, int capacBagageira){
        super(matricula, marca, modelo, potencia);
        this.numQuadro = Integer.parseInt(numQuadro);
        this.capacBagageira = capacBagageira;
    }

    public int getCapacBagageira() {
        return capacBagageira;
    }
    public void setCapacBagageira(int capacBagageira) {
        this.capacBagageira = capacBagageira;
    }
    public int getNumQuadro() {
        return numQuadro;
    }
    public void setNumQuadro(int numQuadro) {
        this.numQuadro = numQuadro;
    }

    public String toString() {
        return "Automovel Ligeiro: " + this.numQuadro + " " + this.capacBagageira + " ," + super.toString();
    }
    public boolean equals(Object obj) {
        return super.equals(obj) && getClass() == obj.getClass() && this.numQuadro == ((AutomovelLigeiro) obj).getNumQuadro() && this.capacBagageira == ((AutomovelLigeiro) obj).getCapacBagageira();
    }
    public int hashCode() {
        return super.hashCode() + this.numQuadro + this.capacBagageira;
    }
}