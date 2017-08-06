package curso4.capitulo3.exercicio7;

public class Exercicio7 
{
    int    x;
    double y;
    String z;
    
    public static void main(String args[])
    {
        Exercicio7 e7 = new Exercicio7();
        
        System.out.print(e7.x + " " + e7.y + " " + e7.z);
        
        e7.z = "1";
        e7.x = 1;
        e7.y = e7.x;
    
        System.out.println(" " +e7.x + " " + e7.y + " " + e7.z);
        
    }
}
