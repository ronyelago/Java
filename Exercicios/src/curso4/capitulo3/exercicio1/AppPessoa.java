package curso4.capitulo3.exercicio1;

import javax.swing.JOptionPane;

public class AppPessoa 
{
       public static void main(String[] args) 
       {
       
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        
        p1.nome = JOptionPane.showInputDialog("Nome: ");
        p1.altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
        
        p2.nome = JOptionPane.showInputDialog("Nome: ");
        p2.altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
        
        if (p1.altura > p2.altura) 
        {
            System.out.println(p1);
        } 
        else if (p1.altura < p2.altura)
        {
            System.out.println(p2);
        }
        else 
        {
            System.out.println("MESMA ALTURA");
        }
       
   }
}
