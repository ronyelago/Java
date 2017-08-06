package curso4.capitulo16.exercicio1;

public class Pessoa {
    
    private String nome;
    private int idade;
    
    public Pessoa(int idade) {
        this.idade = idade;
    }
    
    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public Pessoa(int idade, String nome) {
        this.idade = idade; 
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}
