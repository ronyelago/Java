package curso4.capitulo5.exercicio1;

public class Retangulo
{
    double lado1,
           lado2;
    
    double getArea()
    {
        return lado1 * lado2;
    }
    double getPerimetro()
    {
        return (lado1 + lado2) + (lado1 + lado2);
    }
}
