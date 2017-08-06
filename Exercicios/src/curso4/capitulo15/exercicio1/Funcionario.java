package curso4.capitulo15.exercicio1;

public class Funcionario extends Pessoa {
    
    private double salario;
    
    public void setSalario(double salario) {
        
        this.salario = salario;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    public String toString() {
        return "Salario: " + salario + " " + super.toString();
    }
}
