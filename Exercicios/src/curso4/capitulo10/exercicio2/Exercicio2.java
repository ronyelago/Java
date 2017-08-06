package curso4.capitulo10.exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Exercicio2 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        
        do 
        {
            Integer n = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
            if (n > 0)
                lista.add(n);
            else
                break;
            
        } while (true);
        
        Collections.sort(lista);
        System.out.println(lista);
        
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(i + ":" + Collections.frequency(lista, i));
        }
    }
}

