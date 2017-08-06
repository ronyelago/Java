package curso4.capitulo3.exercicio5;

import javax.swing.JOptionPane;

public class AppFuncionario 
{
    public static void main(String[] args) 
    {
        
        Funcionario f = new Funcionario();
        f.nome = JOptionPane.showInputDialog("Nome: ");
        f.dependentes = Integer.parseInt(JOptionPane.showInputDialog("Dependentes: "));
        f.salario = Double.parseDouble(JOptionPane.showInputDialog("Salario? "));
        System.out.println(f);
        System.out.println(f.salario);
        
        if (f.salario <= 999)
            f.salario += (f.salario * 10) / 100;
        else
            f.salario += (f.salario * 5) / 100;
        
        f.salario += f.dependentes * 66;
        
        System.out.println(f);
        System.out.println(f.salario);
    }
}
