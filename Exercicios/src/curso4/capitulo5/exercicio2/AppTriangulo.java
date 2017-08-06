package curso4.capitulo5.exercicio2;

import javax.swing.JOptionPane;

public class AppTriangulo
{
    public static void main(String[] args) 
    {
        
        Triangulo t = new Triangulo();
        t.base = Double.parseDouble(JOptionPane.showInputDialog("Base: "));
        t.altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
        
        System.out.println(t);
        System.out.println(t.dadosTriangulo());        
    }
}
