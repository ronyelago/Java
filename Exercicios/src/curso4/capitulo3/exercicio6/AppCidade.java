package curso4.capitulo3.exercicio6;

import javax.swing.JOptionPane;

public class AppCidade 
{
    public static void main(String[] args) 
    {
        
        Cidade c1 = new Cidade();
        Cidade c2 = new Cidade();
        double budget = 0;
        double aux = 0;
        
        c1.nome = JOptionPane.showInputDialog("Nome da Cidade 1: ");
        c1.regiao = Integer.parseInt(JOptionPane.showInputDialog("Região de " + c1.nome));
        c1.populacao = Integer.parseInt(JOptionPane.showInputDialog("População de " + c1.nome));
        
        c2.nome = JOptionPane.showInputDialog("Nome da Cidade 2: ");
        c2.regiao = Integer.parseInt(JOptionPane.showInputDialog("Região de " + c2.nome));
        c2.populacao = Integer.parseInt(JOptionPane.showInputDialog("População de " + c2.nome));
        
        budget = Double.parseDouble(JOptionPane.showInputDialog("Orçamento total: "));
        
        double verbaRegiao = budget / 3;
        double verbaPopulacao = budget / 2;
        budget -= (budget / 3) + (budget / 2);
        
        if (c1.regiao == 1)
            c1.totalVerba += (verbaRegiao * 10) / 100;
        if (c1.regiao == 2)
            c1.totalVerba += (verbaRegiao * 20) / 100;
        if (c1.regiao == 3)
            c1.totalVerba += (verbaRegiao * 30) / 100;
        if (c1.regiao == 4)
            c1.totalVerba += (verbaRegiao * 40) / 100;
        if (c1.regiao == 5)
            c1.totalVerba += (verbaRegiao * 50) / 100;

        if (c2.regiao == 1)
            c2.totalVerba += (verbaRegiao * 10) / 100;
        if (c2.regiao == 2)
            c2.totalVerba += (verbaRegiao * 20) / 100;
        if (c2.regiao == 3)
            c2.totalVerba += (verbaRegiao * 30) / 100;
        if (c2.regiao == 4)
            c2.totalVerba += (verbaRegiao * 40) / 100;
        if (c2.regiao == 5)
            c2.totalVerba += (verbaRegiao * 50) / 100;
        
        verbaRegiao -= c1.totalVerba + c2.totalVerba;
        
        if (c1.populacao < 10000)
        {
            c1.totalVerba += (verbaPopulacao * 20) / 100;
            aux += (verbaPopulacao * 20) / 100;
        }
        else
        {
            c1.totalVerba += (verbaPopulacao * 50) / 100;
            aux += (verbaPopulacao * 50) / 100;
        }
        
        
        if (c2.populacao < 10000)
        {
            c2.totalVerba += (verbaPopulacao * 20) / 100;
            aux += (verbaPopulacao * 20) / 100;
        }
        else
        {
            c2.totalVerba += (verbaPopulacao * 50) / 100;
            aux += (verbaPopulacao * 50) / 100;
        }
        
        verbaPopulacao -= aux;
        
        budget += verbaRegiao + verbaPopulacao;
        c1.totalVerba += budget / 2;
        c2.totalVerba += budget / 2;
        
        System.out.println(c1);
        System.out.println(c1.totalVerba);
        
        System.out.println(c2);
        System.out.println(c2.totalVerba);
    }
}