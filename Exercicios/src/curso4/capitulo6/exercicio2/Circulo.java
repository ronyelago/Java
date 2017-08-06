package curso4.capitulo6.exercicio2;

public class Circulo 
{
    private double raio;
    
    public double getRaio()
    {
        return this.raio;
    }
    public void setRaio(double raio)
    {
        this.raio = raio;
    }
    public double getArea()
    {
        return Math.PI * Math.pow(raio, 2);
    }
    public String toString()
    {
        return "Raio: " + raio + " Area: " + getArea();
    }
}
