package Prova1;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AlunoArrayList
{
    public static void main(String[] args)
    {
        // Declaração de um Array dinâmico (ArrayList)
        // que poderá guardar objetos Aluno.
        ArrayList<Aluno> alunos = new ArrayList();
        double notaProva1, notaProva2;
        
        // Instancia 3 objetos Aluno e os adiciona no ArrayList alunos.
        for (int i = 0; i < 3; i++) 
        {
            notaProva1 = Integer.parseInt(JOptionPane.showInputDialog("Nota da Prova 1: "));
            notaProva2 = Integer.parseInt(JOptionPane.showInputDialog("Nota da Prova 2: "));
            Aluno aluno = new Aluno(i+100, notaProva1, notaProva2);
            alunos.add(aluno);
        }
        // Usa um laço for avançado para imprimir os dados
        // de todos os objetos do ArrayList alunos (imprimeDadosAluno()).
        for(Aluno aluno : alunos)
        {
            System.out.println("-------------------------------");
            aluno.imprimeDadosAluno();
            if (aluno.obterMediaAluno() >= 7)
                System.out.println("Aprovado!");
            else
                System.out.println("Reprovado!");
        }
        
        double nova = Double.parseDouble(JOptionPane.showInputDialog("Nova Nota: "));
        
        // Recupera o terceiro (posição 2) aluno (get) e 
        // modifica (setNotaProva2(double nota)) sua segunda nota.
        alunos.get(2).setNotaProva2(nova);
        // Recupera o terceiro (posição 2) aluno(get)
        // e imprime (imprimeDadosAluno()) seus dados.
        alunos.get(2).imprimeDadosAluno();
    }
}
