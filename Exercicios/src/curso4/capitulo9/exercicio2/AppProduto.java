package curso4.capitulo9.exercicio2;

import javax.swing.JOptionPane;

public class AppProduto 
{
    public static void main(String[] args) 
    {
        Produto[] produtos = new Produto[5];
        
        
        for(int i = 0; i < produtos.length; i++)
        {
            produtos[i] = new Produto();
            produtos[i].setNome(JOptionPane.showInputDialog("Nome: "));
            produtos[i].setPreco(Float.parseFloat(JOptionPane.showInputDialog("Preço: ")));
            produtos[i].setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Quantidade: ")));
        }
        
        Produto maior = produtos[0];
        
        for (int i = 0; i < produtos.length; i++)
        {
            
            if (produtos[i].getValorEstoque() > maior.getValorEstoque())
            {
                maior = produtos[i];
            }
        }
        
        System.out.println(maior);
        
        for (Produto p : produtos) 
        {
            System.out.println(p);
        }
    }
}
