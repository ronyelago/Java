package curso4.capitulo14.exercicio1;

public class Motor 
{
    private double potencia;
    private String numeroSerie;

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    
    public String toString() {
        return "Potência: " + getPotencia() + 
               "\nNumero de Serie: " + getNumeroSerie();
    }
}
