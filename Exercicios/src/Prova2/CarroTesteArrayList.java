package Prova2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CarroTesteArrayList 
{
    public static void main(String[] args) 
    {        
        int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantos carros deseja criar? "));
        ArrayList<Carro> carros = new ArrayList();
        
        for (int i = 0; i < qtd; i++)
        {
            String marca = JOptionPane.showInputDialog("Marca: ");
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Preco: "));
            Carro carro = new Carro(marca, ano, valor);
            carros.add(carro);
        }
        
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Carros com valor abaixo de: "));
        
        for (Carro car : carros)
        {
            if (car.getValor() > preco)
                car.imprimir();
        }
    }
}
