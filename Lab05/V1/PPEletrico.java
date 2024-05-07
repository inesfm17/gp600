package Lab05.V1; 

public class PPEletrico extends Veiculo {
    private String numQuadro;
    private int autonomiaMaxima;
    private int capacidadeCarregamento;
    private int tempoCarregamento;
    private int cargaMaxima;

    public PPEletrico(String matricula, String marca, String modelo, int potencia, int autonomiaMaxima, String numQuadro, int capacidadeCarregamento, int tempoCarregamento, int cargaMaxima) {
        super(matricula, marca, modelo, potencia);
        this.numQuadro = numQuadro;
        this.autonomiaMaxima = autonomiaMaxima;
        this.capacidadeCarregamento = capacidadeCarregamento;
        this.tempoCarregamento = tempoCarregamento;
        this.cargaMaxima = cargaMaxima; 
    }

    public String getNumQuadro() {
        return numQuadro;
    }

    public void setNumQuadro(String numQuadro) {
        this.numQuadro = numQuadro;
    }

    public int getAutonomiaMaxima() {
        return autonomiaMaxima;
    }

    public void setAutonomiaMaxima(int autonomiaMaxima) {
        this.autonomiaMaxima = autonomiaMaxima;
    }

    public int getCapacidadeCarregamento() {
        return capacidadeCarregamento;
    }

    public void setCapacidadeCarregamento(int capacidadeCarregamento) {
        this.capacidadeCarregamento = capacidadeCarregamento;
    }

    public int getTempoCarregamento() {
        return tempoCarregamento;
    }

    public void setTempoCarregamento(int tempoCarregamento) {
        this.tempoCarregamento = tempoCarregamento;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public String toString() {
        return "PPEletrico: " + this.numQuadro + " ," + super.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        PPEletrico other = (PPEletrico) obj;
        if (numQuadro == null) {
            if (other.numQuadro != null)
                return false;
        } else if (!numQuadro.equals(other.numQuadro))
            return false;
        return true;
    }

    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((numQuadro == null) ? 0 : numQuadro.hashCode());
        return result;
    }
}
