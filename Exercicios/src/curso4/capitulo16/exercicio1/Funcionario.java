package curso4.capitulo16.exercicio1;

public class Funcionario extends Pessoa {
    
    public Funcionario(int idade) {
        super(idade);
    }
    
    public Funcionario(int idade, double salario) {
        super(idade);
        this.salario = salario;
    }
    
    private double salario;
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    public String toString() {
        return super.toString() + "\nSalario: " + salario;
    }
}
