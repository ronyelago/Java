package curso4.capitulo11.exercicio2;

public class PessoaProtegida 
{
    protected String nome;
    protected int idade;

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
}
