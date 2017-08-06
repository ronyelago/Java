package curso4.capitulo8.exercicio3;

import javax.swing.JOptionPane;

public class AppAluno 
{
    private Aluno aluno;
    
    public static void main(String[] args) 
    {
        AppAluno appAluno = new AppAluno();
        appAluno.menu();        
    }
    
    public void menu()
    {
        int escolha;
        
        do 
        {
            escolha = Integer.parseInt(JOptionPane.showInputDialog("0. Sair"
                    + "\n1. Novo Aluno" + "\n2. Receber Trabalhos" 
                    + "\n3. Receber Provas" + "\n4. Imprimir Media Final" 
                    + "\n5. Imprimir Resultado Final" + "\n6. Imprimir Aluno"));
            
            if (escolha == 0)
                break;
            else if (escolha == 1)
                this.receberDadosAluno();
            else if (escolha == 2)
                this.receberTrabalhos();
            else if (escolha == 3)
                this.receberProvas();
            else if (escolha == 4)
                this.imprimirMediaFinal();
            else if (escolha == 5)
                this.imprimirResultadoFinal();
            else if (escolha == 6)
                this.imprimirAluno();
            else
                System.out.println("Opção inválida!");
            
        } while (true);
    }
    
    public void receberDadosAluno()
    {
        int matricula = Integer.parseInt(JOptionPane.showInputDialog("Matrícula: "));
        String nome = JOptionPane.showInputDialog("Nome: ");
        aluno = new Aluno(matricula, nome);
    }
    
    public void receberTrabalhos()
    {
        if (this.aluno != null)
        {
            double t1 = Double.parseDouble(JOptionPane.showInputDialog("Nota do Trabalho 1: "));
            double t2 = Double.parseDouble(JOptionPane.showInputDialog("Nota do Trabalho 2: "));
            aluno.setNotaTrabalho1(t1);
            aluno.setNotaTrabalho2(t2);
        }
    }
    
    public void receberProvas()
    {
        if (this.aluno != null)
        {
            double p1 = Double.parseDouble(JOptionPane.showInputDialog("Nota da Prova 1: "));
            double p2 = Double.parseDouble(JOptionPane.showInputDialog("Nota da Prova 2: "));
            aluno.setNotaProva1(p1);
            aluno.setNotaProva2(p2);
        }
    }
    
    public void imprimirMediaFinal() 
    {
        if (this.aluno != null)
        {
            System.out.println(aluno.getMediaFinal());
        }
    }
    
    public void imprimirResultadoFinal()
    {
        if (this.aluno != null)
        {
            System.out.println(aluno.getResultadoFinal());
        }
    }
    
    public void imprimirAluno()
    {
        System.out.println(aluno);
    }
    
}
