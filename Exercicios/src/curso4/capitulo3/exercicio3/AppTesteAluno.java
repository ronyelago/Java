package curso4.capitulo3.exercicio3;

import javax.swing.JOptionPane;

public class AppTesteAluno
{
    public static void main(String[] args) 
    {
        double prova1, prova2, prova3;
        Aluno a = new Aluno();
        
        a.nome = JOptionPane.showInputDialog("Nome do Aluno: ");
        prova1 = Double.parseDouble(JOptionPane.showInputDialog("Nota da Prova 1? "));
        prova2 = Double.parseDouble(JOptionPane.showInputDialog("Nota da Prova 2? "));
        prova3 = Double.parseDouble(JOptionPane.showInputDialog("Nota da Prova 3? "));
        a.mediaFinal = (prova1 + prova2 + prova3) / 3;
        
        if (a.mediaFinal >= 7)
            a.situacao = "Aprovado";
        else
            a.situacao = "Reprovado";
        
        System.out.println(a);
        System.out.println(a.situacao);
    }   
}
