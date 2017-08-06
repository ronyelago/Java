package curso4.capitulo12.exercicio2;
import curso4.capitulo12.exercicio1.Caixa;
import curso4.capitulo12.exercicio1.Cliente;
import javax.swing.JOptionPane;

public class AppTeste {
    
    public static void main(String[] args) {

        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo: "));
        String nomeOperador = JOptionPane.showInputDialog("Nome do Operador: ");
        String nome = JOptionPane.showInputDialog("Nome do Cliente");
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo: "));

        Caixa cx1 = new Caixa(codigo);
        cx1.setNomeOperador(nomeOperador);
        
        Cliente cli1 = new Cliente(nome);
        cli1.setSaldo(saldo);
        
        cx1.setCliente(cli1);
        cli1.setCaixa(cx1);
        
        System.out.println(cli1);
        System.out.println(cx1);
    }    
}
