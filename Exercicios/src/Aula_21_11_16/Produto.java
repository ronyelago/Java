package Aula_21_11_16;

import java.util.ArrayList;

public class Produto {
    
    private int codigo;
    private String nome;
    private double preco;
    private ArrayList<Fornecedor> fornecedores = new ArrayList<>();
    
    public Produto(int codigo) {
        this.codigo = codigo;
    }
    
    public Produto(){}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
        this.preco = preco;
    }

    public ArrayList<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(ArrayList<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }
    
    
    public String toString() {
        return "Código: "  + getCodigo() +
               "Nome: " + getNome() +
               "Preço: " + getPreco();
    }
}
