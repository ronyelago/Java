package Aula_21_11_16;

public class ProdutoEspecial extends Produto {
    
    private String descricao;
    private double tamanho;
    private int tipo;
    
    public ProdutoEspecial(int tipo) {
        this.tipo = tipo;
    }
    
    public ProdutoEspecial(){}

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return "Descricao: " + descricao + 
               "\nTtamanho: " + tamanho + 
               "\nTipo: " + tipo;
    }
    
    
}
