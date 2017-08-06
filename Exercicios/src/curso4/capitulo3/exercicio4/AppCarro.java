package curso4.capitulo3.exercicio4;

import javax.swing.JOptionPane;

public class AppCarro 
{
    public static void main(String[] args) 
    {
        double vVia;
        Carro c = new Carro();
        
        c.velocidade = Double.parseDouble(JOptionPane.showInputDialog("Velocidade do carro: "));
        vVia = Double.parseDouble(JOptionPane.showInputDialog("Velocidade da via: "));
        
        if(c.velocidade > (vVia + (vVia * 10) / 100))
            c.quantidadeMultas++;
        
        System.out.println(c);
        System.out.println(c.quantidadeMultas);
        
    }
}
