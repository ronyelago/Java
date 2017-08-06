package Aula_21_11_16;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppTeste {

    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<>();
        ArrayList<Fornecedor> fornecedores = new ArrayList<>();
        Produto prod = null;
        ProdutoEspecial p = null;
        Fornecedor f = null;
        int escolha = 0;

        do {

            escolha = Integer.parseInt(JOptionPane.showInputDialog(
                    " 1. Cadastrar Fornecedor"
                    + "\n2. Cadastrar Produto/ProdutoEspecial"
                    + "\n3. Imprimir Todos"
                    + "\n4.associar produto/fornecedor"
                    + "\n5. Sair"));

            if (escolha == 1) {

                f = new Fornecedor(JOptionPane.showInputDialog("Nome: "));
                f.setCnpj(JOptionPane.showInputDialog("CNPJ: "));
                f.setEndereco(JOptionPane.showInputDialog("Endereço: "));
                fornecedores.add(f);
            } 
            else if (escolha == 2) {

                escolha = Integer.parseInt(JOptionPane.showInputDialog("1. Produto"
                        + "\n2. Produto Especial"));

                if (escolha == 1) {

                    prod = new Produto();
                    prod.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Código: ")));
                    prod.setNome(JOptionPane.showInputDialog("Nome: "));
                    prod.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Preço: ")));
                    produtos.add(prod);
                } else {

                    p = new ProdutoEspecial();
                    p.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Código: ")));
                    p.setNome(JOptionPane.showInputDialog("Nome: "));
                    p.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Preço: ")));
                    p.setTamanho(Double.parseDouble(JOptionPane.showInputDialog("Tamanho: ")));
                    p.setTipo(Integer.parseInt(JOptionPane.showInputDialog("Tipo: ")));
                    produtos.add(p);
                }
                
            } else if (escolha == 3) {

                System.out.println(p);
                System.out.println(f);
            } 
            
            // Associação
            else if (escolha == 4) {
                
                int codprod = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do produto : "));
                
                prod = null;
                f = null;
                
                for (Produto produto : produtos) {
                    
                    if (produto.getCodigo() == codprod) {
                        
                       prod = produto;
                    }
                }
                
                String cnpj = JOptionPane.showInputDialog("Digite o CNPJ: ");
                
                for (Fornecedor forn : fornecedores) {
                    
                    if (forn.getCnpj().equals(cnpj)) {
                        
                       f = forn;
                    }
                }
                
                if (prod != null && f != null) {
                    
                    f.getProduto().add(prod);
                    prod.getFornecedores().add(f);
                }
                
                
            } 
            
            else {
                
                break;
            }

        } while (true);
    }
}
