package curso4.capitulo20.exercicio1;

public  class Circunferencia extends Figura {
    
    public Circunferencia(double raio) {
        this.raio = raio;
    }
    
    private double raio;
    
    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double getRaio() {
        return this.raio;
    }
    
    @Override
    public double calculaArea() {
        return (Math.PI * Math.pow(raio, 2));
    }
}
