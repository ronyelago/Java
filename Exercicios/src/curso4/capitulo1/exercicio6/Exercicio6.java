package curso4.capitulo1.exercicio6;

import javax.swing.JOptionPane;

public class Exercicio6 
{
    public static void main(String[] args) 
    {
        double[][] funcionarios = new double[5][3];
        double total = 0,
               media = 0,
               maior = 0;
    
        for (int i = 0; i < 5; i++)
        {
            total = 0;
            
            for (int j = 0; j < 3 ; j++) 
            {
                funcionarios[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Pontuação do mês " + j + " funcionario " + i));
                total += funcionarios[i][j];
                if (funcionarios[i][j] > maior)
                    maior = funcionarios[i][j];
            }
            
            media = total / 3;
            System.out.println(total);
            System.out.println(media);
        }
        System.out.println(maior);
    }

}
