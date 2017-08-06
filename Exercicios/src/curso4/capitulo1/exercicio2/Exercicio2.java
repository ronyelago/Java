package curso4.capitulo1.exercicio2;

import javax.swing.JOptionPane;

public class Exercicio2 
{
    public static void main(String[] args) 
    {
        int n1 = 0;
        int x;
        
        do 
        {
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
            n1 += x;
        } while (x != 0);
        
        System.out.println(n1);
    }
}
