package curso4.capitulo4.exercicio2;

import javax.swing.JOptionPane;

public class AppLivro 
{
    public static void main(String[] args) 
    {
        
        Livro l1 = new Livro();
        Livro l2 = new Livro();
        Livro l3 = new Livro();
        int clientes = 0;
        int codInt = 0;
        
        l1.codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo do Livro: "));
        l1.titulo = JOptionPane.showInputDialog("Titulo do Livro: ");
        l1.autor = JOptionPane.showInputDialog("Autor do Livro: ");
        l1.editora = JOptionPane.showInputDialog("Editora do Livro: ");
        l1.valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do Livro: "));
        
        l2.codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo do Livro: "));
        l2.titulo = JOptionPane.showInputDialog("Titulo do Livro: ");
        l2.autor = JOptionPane.showInputDialog("Autor do Livro: ");
        l2.editora = JOptionPane.showInputDialog("Editora do Livro: ");
        l2.valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do Livro: "));
        
        l3.codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo do Livro: "));
        l3.titulo = JOptionPane.showInputDialog("Titulo do Livro: ");
        l3.autor = JOptionPane.showInputDialog("Autor do Livro: ");
        l3.editora = JOptionPane.showInputDialog("Editora do Livro: ");
        l3.valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do Livro: "));
        
        clientes = Integer.parseInt(JOptionPane.showInputDialog("Número de Clientes: "));
        
        for (int i = 0; i < clientes; i++)
        {
            codInt = Integer.parseInt(JOptionPane.showInputDialog("Código do Livro Interessante: "));
            
            if (codInt == l1.codigo)
                l1.novoInteressado();
            if (codInt == l2.codigo)
                l2.novoInteressado();
            if (codInt == l3.codigo)
                l3.novoInteressado();
            
        }
        
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        
        l1.imprimirDadosLivro();
        l2.imprimirDadosLivro();
        l3.imprimirDadosLivro();
    }
}
