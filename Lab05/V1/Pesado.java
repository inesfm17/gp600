package Lab05.V1;

public abstract class Pesado extends Veiculo {
    private String numQuadro;
    private int peso;

    public Pesado(String matricula, String marca, String modelo, int potencia, String numQuadro, int peso) {
        super(matricula, marca, modelo, potencia);
        this.numQuadro = numQuadro;
        this.peso = peso;
    }

    public String getNumQuadro() {
        return numQuadro;
    }

    public void setNumQuadro(String numQuadro) {
        this.numQuadro = numQuadro;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pesado other = (Pesado) obj;
        if (numQuadro != other.numQuadro)
            return false;
        if (peso != other.peso)
            return false;
        return super.equals(obj) && true;
    }

}