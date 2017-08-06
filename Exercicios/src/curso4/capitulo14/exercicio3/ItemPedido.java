package curso4.capitulo14.exercicio3;

public class ItemPedido {
    
    private Produto produto = new Produto();
    private double quantidade;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        if (quantidade != 0 && quantidade > 0)
            this.quantidade = quantidade;
    }
    
    public double getPreco() {
        return quantidade * produto.getPreco();
    }
    
    public String toString(){
        return "Produto: " + getProduto() +
               "Quantidade: " + getQuantidade() +
               "Preco Total: " + getPreco();
    }
}
