package Prova_03_10_2016;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppVenda 
{
    public static void main(String[] args) 
    {
        ArrayList<Venda> vendas = new ArrayList();
        int escolha = 0;
        
        do 
        {
            escolha = Integer.parseInt(JOptionPane.showInputDialog(
                            "1. Nova Venda <1> \n"
                            + "2. Listar todas as Vendas <2>\n"
                            + "3. Mostrar maior Venda realizada <3>\n"
                            + "4. Sair <0>"));
            
            if (escolha == 1) 
            {
                int num = Integer.parseInt(JOptionPane.showInputDialog("Numero: "));
                double total = Double.parseDouble(JOptionPane.showInputDialog("Total: "));
                String descricao = JOptionPane.showInputDialog("Descricao: ");
                Venda v = new Venda(num, total, descricao);
                vendas.add(v);
            }
            
            if (escolha == 2)
                for (Venda venda : vendas)
                    System.out.println(venda.toString());
            
            if (escolha == 3)
            {
                Venda maiorVenda = vendas.get(0);
                
                for (Venda v : vendas)
                    if (v.getTotalVenda() > maiorVenda.getTotalVenda())
                        maiorVenda = v;
                
                System.out.println(maiorVenda.toString());
            }
            
        } while (escolha != 0);    
    }
}
