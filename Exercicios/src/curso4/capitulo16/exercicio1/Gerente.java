package curso4.capitulo16.exercicio1;

public class Gerente extends Funcionario {
    
    public Gerente(int idade, double salario) {
        super(idade);
        this.setSalario(salario);
    }
    
    public Gerente(int idade, double salario, String area) {
        super(idade);
        this.setSalario(salario);
        this.area = area;
    }
    
    private String area;
    
    public void setArea(String area) {
        this.area = area;
    }
    
    public String getArea() {
        return this.area;
    }
    
    public String toString() {
        return super.toString() + "\nArea: " + area;
    }
}
