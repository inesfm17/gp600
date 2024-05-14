package Lab05.V1;

public class ALEletrico extends Veiculo {
    private String numQuadro;
    private int capacidadeCarga;
    private int autonomia;
    private int tempoCarga;

    public ALEletrico(String matricula, String marca, String modelo, int potencia, String numQuadro, int capacidadeCarga, int autonomia, int tempoCarga) {
        super(matricula, marca, modelo, potencia);
        this.numQuadro = numQuadro;
        this.capacidadeCarga = capacidadeCarga;
        this.autonomia = autonomia;
        this.tempoCarga = tempoCarga;
    }

    public String getNumQuadro() {
        return numQuadro;
    }

    public void setNumQuadro(String numQuadro) {
        this.numQuadro = numQuadro;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getTempoCarga() {
        return tempoCarga;
    }

    public void setTempoCarga(int tempoCarga) {
        this.tempoCarga = tempoCarga;
    }

    @Override
    public String toString() {
        return "ALEletrico{" +
                "capacidadeCarga=" + capacidadeCarga +
                ", autonomia=" + autonomia +
                ", tempoCarga=" + tempoCarga +
                "} " + super.toString();
    }
}
