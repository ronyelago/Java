package Prova1;

import javax.swing.JOptionPane;

public class AlunoArray 
{
    public static void main(String[] args) 
    {
        Aluno alunos[] = new Aluno[3];
        double notaProva1, notaProva2;
        
        for (int i = 0; i < alunos.length; i++) 
        {
            System.out.println("Aluno " + i+1);
            notaProva1 = Double.parseDouble(JOptionPane.showInputDialog("Nota da Prova 1: "));
            notaProva2 = Double.parseDouble(JOptionPane.showInputDialog("Nota da Prova 2: "));
            alunos[i] = new Aluno(i+100, notaProva1, notaProva2);
        }
        
        for (int i = 0; i < alunos.length; i++) 
        {
            System.out.println("--------------------------------------");
            alunos[i].imprimeDadosAluno();
            if (alunos[i].obterMediaAluno() >= 7)
                System.out.println("Aprovado!");
            else
                System.out.println("Reprovado!");
        }
        
    }
}
