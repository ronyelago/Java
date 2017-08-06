package curso4.capitulo3.exercicio2;

import javax.swing.JOptionPane;

public class AppProduto 
{
    public static void main(String[] args) 
    {
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto();
        
        p1.descricao = JOptionPane.showInputDialog("Descrição do Produto 1: ");
        p1.valor = Double.parseDouble(JOptionPane.showInputDialog("Preço do Produto 1: "));
        
        p2.descricao = JOptionPane.showInputDialog("Descrição do Produto 2: ");
        p2.valor = Double.parseDouble(JOptionPane.showInputDialog("Preço do Produto 2: "));
        
        p3.descricao = JOptionPane.showInputDialog("Descrição do Produto 3: ");
        p3.valor = Double.parseDouble(JOptionPane.showInputDialog("Preço do Produto 3: "));
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p1.valor + p2.valor + p3.valor);        
    }
}
