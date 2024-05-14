package Lab05.V1;

public class Taxi extends AutomovelLigeiro {
    private String numLicenca;

    Taxi(String matricula, String marca, String modelo, int potencia, String numQuadro, int capacBagageira, String numLicenca){
        super(matricula, marca, modelo, potencia, numQuadro, capacBagageira);
        this.numLicenca = numLicenca;
    }

    public String getNumLicenca() {
        return numLicenca;
    }

    public void setNumLicenca(String numLicenca) {
        this.numLicenca = numLicenca;
    }

    public String toString() {
        return "Taxi: " + this.numLicenca + " ," + super.toString();
    }
    public boolean equals(Object obj) {
        return super.equals(obj) && getClass() == obj.getClass() && this.numLicenca == ((Taxi) obj).getNumLicenca();
    }
}
