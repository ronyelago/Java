package curso4.capitulo1.exercicio3;
import javax.swing.JOptionPane;

public class Exercicio3 
{
    public static void main(String[] args) 
    {
        int x = 0;
        int i1 = 0, i2 = 0, i3 = 0, i4 = 0;
        
        do 
        {
            
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            
            if (x >= 1 && x <= 25)
                i1++;
            else if (x > 25 && x <= 50)
                i2++;
            else if (x > 50 && x <= 75)
                i3++;
            else if (x > 75 && x <= 100)
                i4++;
            
        } while (x != 0);
        
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
    }   
}
