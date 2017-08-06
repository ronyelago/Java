package curso4.capitulo5.exercicio2;

public class Triangulo 
{
    double base,
           altura;
    
    double getArea()
    {
        return (base * altura) / 2;
    }
    public String dadosTriangulo()
    {
        return "Base: " + base + " Altura: " + altura + " Area: " + getArea();
    }
}
