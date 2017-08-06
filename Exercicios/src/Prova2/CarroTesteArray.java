package Prova2;
import javax.swing.JOptionPane;

public class CarroTesteArray 
{
    public static void main(String[] args) 
    {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Quantos Carros deseja criar? "));
        Carro carros[] = new Carro[n];
        
        for (int i = 0; i < carros.length; i++)
        {
            String marca = JOptionPane.showInputDialog("Marca: ");
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Preco: "));
            carros[i] = new Carro(marca, ano, valor);
        }
        
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
        
        for (int i = 0; i < carros.length; i++) 
        {
            if (carros[i].getValor() < valor)
                System.out.println(carros[i].toString());
        }
    }
}
