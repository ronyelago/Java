package curso4.capitulo6.exercicio2;

import javax.swing.JOptionPane;

public class AppCirculo 
{
    public static void main(String[] args) 
    {
        
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo();
        Circulo c3 = new Circulo();
        
        c1.setRaio(Double.parseDouble(JOptionPane.showInputDialog("Raio 1: ")));
        c2.setRaio(Double.parseDouble(JOptionPane.showInputDialog("Raio 2: ")));
        c3.setRaio(Double.parseDouble(JOptionPane.showInputDialog("Raio 3: ")));
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        
    }
}
