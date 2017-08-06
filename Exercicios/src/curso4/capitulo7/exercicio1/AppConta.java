package curso4.capitulo7.exercicio1;

import javax.swing.JOptionPane;

public class AppConta
{
    public static void main(String[] args) 
    {
        double deposito;
        double saque;
        int option = 0;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Numero da Conta: "));
        
        Conta c = new Conta(numero);
        
        c.setCliente(JOptionPane.showInputDialog("Nome do Cliente: "));
        c.depositar(Double.parseDouble(JOptionPane.showInputDialog("Deposito Inicial: ")));
        
        do 
        {
            option = Integer.parseInt(JOptionPane.showInputDialog("Menu: \n"
                    + "Consultar o Saldo <1>\n" + "Sacar <2>\n" + "Depositar <3>\n "
                    + "Imprimir Dados da Conta <4>\n" + "Sair <0>\n" ));
            
            if (option == 1)
                System.out.println(c.getSaldo());
            if (option == 2)
            {
                saque = Double.parseDouble(JOptionPane.showInputDialog("Valor a Sacar: "));
                if (c.sacar(saque))
                    c.sacar(saque);
                else
                    System.out.println("Saldo Insuficiente");
            }
            if (option == 3)
            {
                deposito = Double.parseDouble(JOptionPane.showInputDialog("Valor a Depositar: "));
                c.depositar(deposito);
            }
            if (option == 4)
                System.out.println(c.toString());
            
        } while (option != 0);
        
        
    }
}
