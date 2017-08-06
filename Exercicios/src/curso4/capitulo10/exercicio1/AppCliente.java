package curso4.capitulo10.exercicio1;
import curso4.capitulo9.exercicio1.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppCliente 
{
    public static void main(String[] args) 
    {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        
        for (int i = 0; i < 5; i++) 
        {
            Cliente c = new Cliente();
            c.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Código: ")));
            c.setNome(JOptionPane.showInputDialog("Nome: "));
            c.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Saldo: ")));
            clientes.add(c);
        }
        
        imprimir(clientes);
        
    }
    public static void imprimir(ArrayList<Cliente> clientes)
    {
        for (Cliente c : clientes)
        {
            System.out.println(c);
        }
    }
}
