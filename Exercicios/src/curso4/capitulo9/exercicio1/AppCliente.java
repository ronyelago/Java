package curso4.capitulo9.exercicio1;

import javax.swing.JOptionPane;

public class AppCliente 
{
    public static void main(String[] args) 
    {
        Cliente[] clientes = new Cliente[5];
        
        for(int i = 0; i < clientes.length; i++)
        {
            clientes[i] = new Cliente();
            clientes[i].setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Código: ")));
            clientes[i].setNome(JOptionPane.showInputDialog("Nome: "));
            clientes[i].setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Saldo: ")));
        }
        
        imprimir(clientes);
    }
    
    public static void imprimir(Cliente clientes[])
    {
        for (Cliente cliente : clientes)
        {
            System.out.println(cliente);
        }
    }
}
