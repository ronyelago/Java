package curso4.capitulo20.exercicio1;

public class Triangulo extends Figura {
    
    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }
    
    private double altura;
    private double base;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    @Override
    public double calculaArea() {
        return (base * altura) / 2;
    }
}
