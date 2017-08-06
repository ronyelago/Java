package curso4.capitulo18.exercicio1;

public abstract class Funcionario {
    
    public Funcionario(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
    
    private String nome;
    private int numeroRegistro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numero) {
        this.numeroRegistro = numero;
    }
    
    public String toString() {
        return "Número: " + numeroRegistro + 
                "Nome: " + nome + "Salario Bruto :" + obterSalarioBruto();
    }
    
    public abstract double obterSalarioBruto();
}