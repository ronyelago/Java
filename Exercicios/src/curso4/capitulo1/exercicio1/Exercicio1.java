package curso4.capitulo1.exercicio1;

import javax.swing.JOptionPane;

public class Exercicio1 
{
    public static void main(String[] args) 
    {
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço: "));
        int categoria = Integer.parseInt(JOptionPane.showInputDialog("Digite a categoria: "));
        
        if (preco <= 25) 
        {
            if (categoria == 1) 
                preco += (preco * 5) / 100;
            if (categoria == 2)
                preco += (preco * 8) / 100;
            if (categoria == 3)
                preco += (preco * 10) / 100;
        }
        else
        {
            if (categoria == 1) 
                preco += (preco * 12) / 100;
            if (categoria == 2)
                preco += (preco * 15) / 100;
            if (categoria == 3)
                preco += (preco * 18) / 100;
        }
        if (preco <= 50)
        {
            System.out.println(preco);
            System.out.println("BARATO");
        }
        else if (preco > 50 && preco < 120) 
        {
            System.out.println(preco);
            System.out.println("NORMAL");
        }
        else
        {
            System.out.println(preco);
            System.out.println("CARO");
        }
    }
}
