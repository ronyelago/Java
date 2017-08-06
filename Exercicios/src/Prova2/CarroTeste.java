package Prova2;
import javax.swing.JOptionPane;

public class CarroTeste 
{
    public static void main(String[] args) 
    {
        Carro volks, audi, volvo;
        String marca = "";
        int ano;
        double valor;
        
        marca = JOptionPane.showInputDialog("Marca: ");
        ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Preco: "));
        volks = new Carro(marca, ano, valor);
        
        marca = JOptionPane.showInputDialog("Marca: ");
        ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));
        audi = new Carro(marca, ano);
        
        marca = JOptionPane.showInputDialog("Marca: ");
        volvo = new Carro(marca);
        
        System.out.println(volks.toString());
        System.out.println(audi.toString());
        System.out.println(volvo.toString());
    }
}
