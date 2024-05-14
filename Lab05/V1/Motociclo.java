package Lab05.V1;

public class Motociclo extends Veiculo {
    private tipo tipo;

    Motociclo(String matricula, String marca, String modelo, int potencia, String Tipo){
        super(matricula, marca, modelo, potencia);
        tipo tipoMotociclo;
        // Verifica o tipo fornecido e atribui o correspondente valor enum a tipoMotociclo
        if (Tipo.equalsIgnoreCase("DESPORTIVO")) {
            tipoMotociclo = Lab05.V1.tipo.DESPORTIVO;
        } else if (Tipo.equalsIgnoreCase("ESTRADA")) {
            tipoMotociclo = Lab05.V1.tipo.ESTRADA;
        } else {
            // Lançar uma exceção se o tipo não for reconhecido
            throw new IllegalArgumentException("Tipo de motocicleta inválido: " + Tipo);
        }
        this.tipo = tipoMotociclo;
    }

    public tipo getTipo() {
        return tipo;
    }

    public void setTipo(tipo tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return "Motociclo: " + this.tipo + " ," + super.toString();
    }
    public boolean equals(Object obj) {
        return super.equals(obj) && getClass() == obj.getClass() && this.tipo == ((Motociclo) obj).getTipo();
    }
    public int hashCode() {
        return super.hashCode() + Lab05.V1.tipo.valueOf(this.tipo.toString()).ordinal() * 100000;
    }
}