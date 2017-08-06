package curso4.capitulo14.exercicio3;

public class Produto {
    
    private int idProduto;
    private String nome;
    private double preco;
    private String unidade;

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0 && preco != 0){
            this.preco = preco;   
        }
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    
    public String toString() {
        return "ID do Produto: " + getIdProduto() +
               "\nNome: " + getNome() +
               "\nPreço: " + getPreco() +
               "\nUnidade: " + getUnidade();
    }
}
