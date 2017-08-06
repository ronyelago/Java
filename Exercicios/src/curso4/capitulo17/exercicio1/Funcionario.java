package curso4.capitulo17.exercicio1;

public class Funcionario {
    
    public Funcionario(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
    
    private String nome;
    private int numeroRegistro;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
    
    public int getNumeroRegistro() {
        return this.numeroRegistro;
    }
    
    public double obterSalarioBruto() {
        return 0;
    }
    
    public String toString() {
        return "Numero do Registro: " + numeroRegistro + "\nNome: " + nome +
               "Salario Bruto: " + obterSalarioBruto();
    }
}
