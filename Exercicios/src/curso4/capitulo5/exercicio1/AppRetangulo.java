package curso4.capitulo5.exercicio1;

import javax.swing.JOptionPane;

public class AppRetangulo 
{
    public static void main(String[] args) 
    {
        
        Retangulo r = new Retangulo();
        
        r.lado1 = Double.parseDouble(JOptionPane.showInputDialog("Lado 1: "));
        r.lado2 = Double.parseDouble(JOptionPane.showInputDialog("Lado 2: "));
        
        System.out.println(r);
        System.out.println(r.getPerimetro());
        System.out.println(r.getArea());
        
    }
}
