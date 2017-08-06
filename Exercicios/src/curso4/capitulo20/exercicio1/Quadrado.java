package curso4.capitulo20.exercicio1;

public class Quadrado extends Figura {
    
    public Quadrado(double lado) {
        this.lado = lado;
    }
        
    private double lado;
    
    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public double getLado() {
        return this.lado;
    }
    
    public double calculaArea() {
        return this.lado * this.lado;
    }

}
