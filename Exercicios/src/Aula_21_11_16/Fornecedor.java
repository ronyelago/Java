package Aula_21_11_16;

import java.util.ArrayList;

public class Fornecedor {
    
    private String nome;
    private String cnpj;
    private String endereco;
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    
    public Fornecedor(String nome){
        this.nome = nome;
    }
    
    public Fornecedor(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String toString() {
        return "Nome: " + getNome() +
               "\nCNPJ: " + getCnpj() +
               "\nEndereco: " + getEndereco();
    }

    public ArrayList<Produto> getProduto() {
        return produtos;
    }

    public void setProduto(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
}
