package curso4.capitulo4.exercicio1;

import javax.swing.JOptionPane;

public class AppCasa 
{
    public static void main(String[] args) 
    {
    
        Casa c = new Casa();
        c.numero = Integer.parseInt(JOptionPane.showInputDialog("Número da Casa: "));
        c.cor = JOptionPane.showInputDialog("Cor da Casa: ");
        
        String escolha = JOptionPane.showInputDialog("Deseja abrir a porta da casa? <S> / <N> :").toUpperCase();
        if (escolha.equals("S"))
            c.abrirPorta();
        
        escolha = JOptionPane.showInputDialog("Deseja abrir a janela da casa? <S> / <N> :").toUpperCase();
        if (escolha.equals("S"))
            c.abrirJanela();
        
        System.out.println(c);
        c.imprimirDadosCasa();
    }
}
