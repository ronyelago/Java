package curso4.capitulo14.exercicio1;

public class Pneu 
{
    private double tamanho;
    private String fabricante;
    
    public Pneu(double tamanho){
        this.tamanho = tamanho;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public String toString(){
        return "Tamanho: " + getTamanho() + "\nFabricante: " + getFabricante();
    }
}
