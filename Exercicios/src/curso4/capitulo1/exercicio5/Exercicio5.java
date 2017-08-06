package curso4.capitulo1.exercicio5;
import javax.swing.JOptionPane;

public class Exercicio5 
{
    public static void main(String[] args)
    {
        int aumento = 1;
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário: "));
        
        for (int ano = 2001; ano <= 2008; ano++) 
        {
            salario += (salario * aumento) / 100;
            aumento += aumento;
        }
        System.out.println(salario);
    }
}
